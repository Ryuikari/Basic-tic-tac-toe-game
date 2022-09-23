package hw20;

import java.awt.event.*;
import javax.swing.*;

public class TicTacToe extends JFrame implements ActionListener{
	static JFrame window;
	static JButton b00;
	static JButton b01;
	static JButton b02;
	static JButton b10;
	static JButton b11;
	static JButton b12;
	static JButton b20;
	static JButton b21;
	static JButton b22;
	
	static JLabel header;
	static JTextArea gameOutput;
	
	static char[][] gameBoard = new char[3][3];
	
	private static char currentChar;
	
	private static boolean shouldUpdate;
	
	TicTacToe(){
	}
	
	private static void resetBoard() {
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 3; col++) {
				gameBoard[row][col] = '-';
			}
		}
		// TODO also update the GUI
	}
	
	private static void drawGameBoard(boolean shouldUpdate) {
		String newGameBoard = "";
		
		if(!shouldUpdate) {
			return;
		}
		else {
			for(int row = 0; row < 3; row++) {
				for(int col = 0; col < 3; col++) {
					newGameBoard += gameBoard[row][col];
				}
				newGameBoard += "\n";
			}
		}
		gameOutput.setText(newGameBoard);
	}
	
	public static void main(String[] args) {
		
		currentChar = 'x'; // x goes first
		

		
		window = new JFrame("TerribleTicTacToe");
		
		header = new JLabel("Click buttons to choose");
		
		b00 = new JButton("00");
		b01 = new JButton("01");
		b02 = new JButton("02");
		
		b10 = new JButton("10");
		b11 = new JButton("11");
		b12 = new JButton("12");
		
		b20 = new JButton("20");
		b21 = new JButton("21");
		b22 = new JButton("22");
		
		gameOutput = new JTextArea();
		
		TicTacToe terribleGame = new  TicTacToe();
		
		b00.addActionListener(terribleGame);
		b01.addActionListener(terribleGame);
		b02.addActionListener(terribleGame);
		b10.addActionListener(terribleGame);
		b11.addActionListener(terribleGame);
		b12.addActionListener(terribleGame);
		b20.addActionListener(terribleGame);
		b21.addActionListener(terribleGame);
		b22.addActionListener(terribleGame);

		
		JPanel headerPanel = new JPanel();
		headerPanel.setLayout(new BoxLayout(headerPanel, BoxLayout.X_AXIS));
		headerPanel.add(header);
		
		JPanel row0Panel = new JPanel();
		row0Panel.setLayout(new BoxLayout(row0Panel, BoxLayout.X_AXIS));
		row0Panel.add(b00);
		row0Panel.add(b01);
		row0Panel.add(b02);
		
		JPanel row1Panel = new JPanel();
		row1Panel.setLayout(new BoxLayout(row1Panel, BoxLayout.X_AXIS));
		row1Panel.add(b10);
		row1Panel.add(b11);
		row1Panel.add(b12);
		
		JPanel row2Panel = new JPanel();
		row2Panel.setLayout(new BoxLayout(row2Panel, BoxLayout.X_AXIS));
		row2Panel.add(b20);
		row2Panel.add(b21);
		row2Panel.add(b22);
		
		
		JPanel outputPanel = new JPanel();
		outputPanel.add(gameOutput);
		
		JPanel allTogether = new JPanel();
		allTogether.setLayout(new BoxLayout(allTogether, BoxLayout.Y_AXIS));
		allTogether.add(headerPanel);
		allTogether.add(row0Panel);
		allTogether.add(row1Panel);
		allTogether.add(row2Panel);
		allTogether.add(outputPanel);
		
		window.add(allTogether);
		window.setSize(300, 300);
		
		// Get ready to start the game...
		resetBoard();
		
		drawGameBoard(true);
		
		window.setVisible(true);
	}
	
	// Note that on geeksforgeeks they didnt use this annotation. You should.
	@Override
	public void actionPerformed(ActionEvent e) {
		String selection = e.getActionCommand();
		
		shouldUpdate = false; // make sure to set it back to false;
		
		switch(selection) {
			case "00":
				if(gameBoard[0][0] == '-') {
					shouldUpdate = true;
					gameBoard[0][0] = currentChar;
					if(currentChar == 'x') {
						currentChar = 'o';
					}
					else {
						currentChar = 'x';
					}
				}
				break;
			case "01":
				if(gameBoard[0][1] == '-') {
					shouldUpdate = true;
					gameBoard[0][1] = currentChar;
					if(currentChar == 'x') {
						currentChar = 'o';
					}
					else {
						currentChar = 'x';
					}
				}
				break;
			case "02":
				if(gameBoard[0][2] == '-') {
					shouldUpdate = true;
					gameBoard[0][2] = currentChar;
					if(currentChar == 'x') {
						currentChar = 'o';
					}
					else {
						currentChar = 'x';
					}
				}
				break;
			case "10":
				if(gameBoard[1][0] == '-') {
					shouldUpdate = true;
					gameBoard[1][0] = currentChar;
					if(currentChar == 'x') {
						currentChar = 'o';
					}
					else {
						currentChar = 'x';
					}
				}
			case "11":
				if(gameBoard[1][1] == '-') {
					shouldUpdate = true;
					gameBoard[1][1] = currentChar;
					if(currentChar == 'x') {
						currentChar = 'o';
					}
					else {
						currentChar = 'x';
					}
				}
				break;
			case "12":
				if(gameBoard[1][2] == '-') {
					shouldUpdate = true;
					gameBoard[1][2] = currentChar;
					if(currentChar == 'x') {
						currentChar = 'o';
					}
					else {
						currentChar = 'x';
					}
				}
				break;
			
			case "20":
				if(gameBoard[2][0] == '-') {
					shouldUpdate = true;
					gameBoard[2][0] = currentChar;
					if(currentChar == 'x') {
						currentChar = 'o';
					}
					else {
						currentChar = 'x';
					}
				}	
				break;
			case "21":
				if(gameBoard[2][1] == '-') {
					shouldUpdate = true;
					gameBoard[2][1] = currentChar;
					if(currentChar == 'x') {
						currentChar = 'o';
					}
					else {
						currentChar = 'x';
					}
				}
				break;
				
			case "22":
				if(gameBoard[2][2] == '-') {
					shouldUpdate = true;
					gameBoard[2][2] = currentChar;
					if(currentChar == 'x') {
						currentChar = 'o';
					}
					else {
						currentChar = 'x';
					}
				}
				break;
		}
		drawGameBoard(shouldUpdate);
	}

}
