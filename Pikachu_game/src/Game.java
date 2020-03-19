import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Game {
	private Grid grid;
	private int userRow;
	private int msElapsed;
	private int timesGet;
	private int timesAvoid;
	private int PlaySound;

	public Game() {
		grid = new Grid(5, 10);
		userRow = 2;
		msElapsed = 0;
		timesGet = 0;
		timesAvoid = 0;
		updateTitle();
		grid.setImage(new Location(userRow, 0), "pikachuGrass.png");
		File bgm = new File("battle.wav");
		playSound(bgm);
	}

	public void play() {
		while (!isGameOver()) {
			grid.pause(100);
			handleKeyPress();
			if (msElapsed % 300 == 0) {
				scrollLeft();
				populateRightEdge();
			}
			updateTitle();
			msElapsed += 100;
		}
	}
	
	public static void playSound(File sound) {
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(sound));
			clip.start();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void handleKeyPress() {
		int key = grid.checkLastKeyPressed();
		if (key == 38) {
			grid.setImage(new Location(userRow, 0), "grass.png");
			userRow = userRow == 0 ? 0 : userRow - 1;
			grid.setImage(new Location(userRow, 0), "pikachuGrass.png");
		} else if (key == 40) {
			grid.setImage(new Location(userRow, 0), "grass.png");
			userRow = userRow == 4 ? 4 : userRow + 1;
			grid.setImage(new Location(userRow, 0), "pikachuGrass.png");
		}
	}

	public void populateRightEdge() {
		double random = Math.random();
		if (random <= 0.5) {
			grid.setImage(new Location((int) (Math.random()*5), grid.getNumCols() - 1), Math.random() < 0.6 ? "grassGround.png" : "grassWater.png");
		}

	}

	public void scrollLeft() {
		for (int x = 0; x < grid.getNumRows(); x++) {
			for (int y = 0; y < grid.getNumCols(); y++) {
				String hunter = grid.getImage(new Location(x, y));
				if (hunter != "grass.png" && y != 0) {
					if (handleCollision(new Location(x, y)) == false) {
						grid.setImage(new Location(x, y), "grass.png");
						grid.setImage(new Location(x, y - 1), hunter);

					} else if (handleCollision(new Location(x, y)) == true) {
						grid.setImage(new Location(x, y), "grass.png");
					}
				} else if (hunter != "pikachuGrass.png") {
					grid.setImage(new Location(x, y), "grass.png");
				}
			}
		}
	}

	public boolean handleCollision(Location loc) {
		String pokeType = grid.getImage(loc);
		if (loc.getCol() == 1) {
			if (grid.getImage(new Location(loc.getRow(), 0)) == "pikachuGrass.png") {
				switch (pokeType) {
				case "grassGround.png":
					timesAvoid++;
					break;
				case "grassWater.png":
					timesGet++;
					break;
				}
				return true;
			}

		}
		return false;
	}

	public int getScore() {
		int score = 10 - timesAvoid + timesGet;
		return score;
	}

	public void updateTitle() {
		grid.setTitle("Pika's Health:  " + getScore());
		if(getScore() < 1) {
			grid.setTitle("Pikachu got stunned and passed out");
		} else if(getScore() == 20){
			grid.setTitle("That's it! I knew you could do it!");
		}
	}

	public boolean isGameOver() {
		if (getScore() < 1 || getScore() == 20) {
			return true;
		} else {
			return false;
		}
	}

	public static void test() {
		Game game = new Game();
		game.play();
	}

	public static void main(String[] args) {
		test();
	}
}