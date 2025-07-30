package baseball;

public class BaseBallTeam {
	//フィールド
	private String name; //チーム名
	private int win; //勝ち数
	private int lose; //負け数
	private int draw; //引き分け数
	private double rate; 
	
	//引数なしのコンストラクタ
	public BaseBallTeam() {
	}
	
	public BaseBallTeam(String name, int win, int lose, int draw) {
		this.name = name;
		this.win = win;
		this.lose = lose;
		this.draw = draw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public int getLose() {
		return lose;
	}

	public void setLose(int lose) {
		this.lose = lose;
	}

	public int getDraw() {
		return draw;
	}

	public void setDraw(int draw) {
		this.draw = draw;
	}
	
	//勝率をdoubleで計算し戻すメソッド
	public static double getRate(int win, int lose) {
		double result = win * (win + lose);
		return result;
	}

	//reportで結果を表示するメソッド
	public void report() {
		System.out.println(name + "の2022年の成績は、" + win + "勝" + lose + "敗" + draw + "分、勝率は" + rate + "です。");
	}
}
