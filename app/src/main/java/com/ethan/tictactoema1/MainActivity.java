package com.ethan.tictactoema1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    public static final char HUMAN_PLAYER = 'X';
    public static final char COMPUTER_PLAYER = 'O';
    private final int BOARD_SIZE = 9;
    public char turn = 'X';
    public int win = 0;
    public int move = 0;
    private Random mRand = new Random();
    private char mBoard[] = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};

    // define variables for the widgets
    private Button[] mBoardButtons;
    private Button newGameButton;
    private TextView infoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get references to the widgets
        mBoardButtons = new Button[9];
        mBoardButtons[0] = (Button) findViewById(R.id.button1);
        mBoardButtons[1] = (Button) findViewById(R.id.button2);
        mBoardButtons[2] = (Button) findViewById(R.id.button3);
        mBoardButtons[3] = (Button) findViewById(R.id.button4);
        mBoardButtons[4] = (Button) findViewById(R.id.button5);
        mBoardButtons[5] = (Button) findViewById(R.id.button6);
        mBoardButtons[6] = (Button) findViewById(R.id.button7);
        mBoardButtons[7] = (Button) findViewById(R.id.button8);
        mBoardButtons[8] = (Button) findViewById(R.id.button9);
        newGameButton = (Button) findViewById(R.id.NewGame);
        infoTextView = (TextView) findViewById(R.id.infoLabel);

        // set the listeners
        mBoardButtons[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button1: {
                        if (win == 0) {
                            if (turn == HUMAN_PLAYER && mBoardButtons[0].getText() != "O" && mBoardButtons[0].getText() != "X") {
                                turn = COMPUTER_PLAYER;
                                infoTextView.setText("Computer's Turn");
                                mBoard[0] = HUMAN_PLAYER;
                                mBoardButtons[0].setText("X");
                                displayBoard();
                                win = checkForWinner();
                                showStatus();
                                if (win == 0) {
                                    getComputerMove();
                                    turn = HUMAN_PLAYER;
                                    infoTextView.setText("Human's Turn");
                                    displayBoard();
                                    win = checkForWinner();
                                    showStatus();
                                }
                            }
                        }
                    }
                    break;
                }
            }
        });


        mBoardButtons[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button2: {
                        if (win == 0) {
                            if (turn == HUMAN_PLAYER && mBoardButtons[1].getText() != "O" && mBoardButtons[1].getText() != "X") {
                                turn = COMPUTER_PLAYER;
                                infoTextView.setText("Computer's Turn");
                                mBoard[1] = HUMAN_PLAYER;
                                mBoardButtons[1].setText("X");
                                displayBoard();
                                win = checkForWinner();
                                showStatus();
                                if (win == 0) {
                                    getComputerMove();
                                    turn = HUMAN_PLAYER;
                                    infoTextView.setText("Human's Turn");
                                    displayBoard();
                                    win = checkForWinner();
                                    showStatus();
                                }
                            }
                        }
                        break;
                    }
                }
            }
        });
        mBoardButtons[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button3: {
                        if (win == 0) {
                            if (turn == HUMAN_PLAYER && mBoardButtons[2].getText() != "O" && mBoardButtons[2].getText() != "X") {
                                turn = COMPUTER_PLAYER;
                                infoTextView.setText("Computer's Turn");
                                mBoard[2] = HUMAN_PLAYER;
                                mBoardButtons[2].setText("X");
                                displayBoard();
                                win = checkForWinner();
                                showStatus();
                                if (win == 0) {
                                    getComputerMove();
                                    turn = HUMAN_PLAYER;
                                    infoTextView.setText("Human's Turn");
                                    displayBoard();
                                    win = checkForWinner();
                                    showStatus();
                                }
                            }
                        }
                        break;
                    }
                }
            }
        });
        mBoardButtons[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button4: {
                        if (win == 0) {
                            if (turn == HUMAN_PLAYER && mBoardButtons[3].getText() != "O" && mBoardButtons[3].getText() != "X") {
                                turn = COMPUTER_PLAYER;
                                infoTextView.setText("Computer's Turn");
                                mBoard[3] = HUMAN_PLAYER;
                                mBoardButtons[3].setText("X");
                                displayBoard();
                                win = checkForWinner();
                                showStatus();
                                if (win == 0) {
                                    getComputerMove();
                                    turn = HUMAN_PLAYER;
                                    infoTextView.setText("Human's Turn");
                                    displayBoard();
                                    win = checkForWinner();
                                    showStatus();
                                }
                            }
                        }
                        break;
                    }
                }
            }
        });
        mBoardButtons[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button5: {
                        if (win == 0) {
                            if (turn == HUMAN_PLAYER && mBoardButtons[4].getText() != "O" && mBoardButtons[4].getText() != "X") {
                                turn = COMPUTER_PLAYER;
                                infoTextView.setText("Computer's Turn");
                                mBoard[4] = HUMAN_PLAYER;
                                mBoardButtons[4].setText("X");
                                displayBoard();
                                win = checkForWinner();
                                showStatus();
                                if (win == 0) {
                                    getComputerMove();
                                    turn = HUMAN_PLAYER;
                                    infoTextView.setText("Human's Turn");
                                    displayBoard();
                                    win = checkForWinner();
                                    showStatus();
                                }
                            }
                        }
                        break;
                    }
                }
            }
        });
        mBoardButtons[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button6: {
                        if (win == 0) {
                            if (turn == HUMAN_PLAYER && mBoardButtons[5].getText() != "O" && mBoardButtons[5].getText() != "X") {
                                turn = COMPUTER_PLAYER;
                                infoTextView.setText("Computer's Turn");
                                mBoard[5] = HUMAN_PLAYER;
                                mBoardButtons[5].setText("X");
                                displayBoard();
                                win = checkForWinner();
                                showStatus();
                                if (win == 0) {
                                    getComputerMove();
                                    turn = HUMAN_PLAYER;
                                    infoTextView.setText("Human's Turn");
                                    displayBoard();
                                    win = checkForWinner();
                                    showStatus();
                                }
                            }
                        }
                        break;
                    }
                }
            }
        });
        mBoardButtons[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button7: {
                        if (win == 0) {
                            if (turn == HUMAN_PLAYER && mBoardButtons[6].getText() != "O" && mBoardButtons[6].getText() != "X") {
                                turn = COMPUTER_PLAYER;
                                infoTextView.setText("Computer's Turn");
                                mBoard[6] = HUMAN_PLAYER;
                                mBoardButtons[6].setText("X");
                                displayBoard();
                                win = checkForWinner();
                                showStatus();
                                if (win == 0) {
                                    getComputerMove();
                                    turn = HUMAN_PLAYER;
                                    infoTextView.setText("Human's Turn");
                                    displayBoard();
                                    win = checkForWinner();
                                    showStatus();
                                }
                            }
                        }
                        break;
                    }
                }
            }
        });
        mBoardButtons[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button8: {
                        if (win == 0) {
                            if (turn == HUMAN_PLAYER && mBoardButtons[7].getText() != "O" && mBoardButtons[7].getText() != "X") {
                                turn = COMPUTER_PLAYER;
                                infoTextView.setText("Computer's Turn");
                                mBoard[7] = HUMAN_PLAYER;
                                mBoardButtons[7].setText("X");
                                displayBoard();
                                win = checkForWinner();
                                showStatus();
                                if (win == 0) {
                                    getComputerMove();
                                    turn = HUMAN_PLAYER;
                                    infoTextView.setText("Human's Turn");
                                    displayBoard();
                                    win = checkForWinner();
                                    showStatus();
                                }
                            }
                        }
                        break;
                    }
                }
            }
        });
        mBoardButtons[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button9: {
                        if (win == 0) {
                            if (turn == HUMAN_PLAYER && mBoardButtons[8].getText() != "O" && mBoardButtons[8].getText() != "X") {
                                turn = COMPUTER_PLAYER;
                                infoTextView.setText("Computer's Turn");
                                mBoard[8] = HUMAN_PLAYER;
                                mBoardButtons[8].setText("X");
                                displayBoard();
                                win = checkForWinner();
                                showStatus();
                                if (win == 0) {
                                    getComputerMove();
                                    turn = HUMAN_PLAYER;
                                    infoTextView.setText("Human's Turn");
                                    displayBoard();
                                    win = checkForWinner();
                                    showStatus();

                                }
                            }
                        }
                        break;
                    }
                }
            }
        });
        newGameButton.setOnClickListener(nGL);
    }


    private View.OnClickListener nGL = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if (v.getId() == R.id.NewGame) {
                for (int i = 0; i < BOARD_SIZE; i++) {
                    mBoard[i] = ' ';
                    mBoardButtons[i].setText(" ");
                }
                turn = HUMAN_PLAYER;
                infoTextView.setText("Human's Turn");
                win = 0;
            }
        }
    };

    public void showStatus() {
        if (win == 1)
            infoTextView.setText("It's a tie.");
        else if (win == 2)
            infoTextView.setText(HUMAN_PLAYER + " wins!");
        else if (win == 3)
            infoTextView.setText(COMPUTER_PLAYER + " wins!");

    }

    private void displayBoard() {
        System.out.println();
        System.out.println(mBoard[0] + " | " + mBoard[1] + " | " + mBoard[2]);
        System.out.println("-----------");
        System.out.println(mBoard[3] + " | " + mBoard[4] + " | " + mBoard[5]);
        System.out.println("-----------");
        System.out.println(mBoard[6] + " | " + mBoard[7] + " | " + mBoard[8]);
        System.out.println();
    }

    private int checkForWinner() {
        // Check horizontal wins
        for (int i = 0; i <= 6; i += 3) {
            if (mBoard[i] == HUMAN_PLAYER &&
                    mBoard[i + 1] == HUMAN_PLAYER &&
                    mBoard[i + 2] == HUMAN_PLAYER)
                return 2;
            if (mBoard[i] == COMPUTER_PLAYER &&
                    mBoard[i + 1] == COMPUTER_PLAYER &&
                    mBoard[i + 2] == COMPUTER_PLAYER)
                return 3;
        }

        // Check vertical wins
        for (int i = 0; i <= 2; i++) {
            if (mBoard[i] == HUMAN_PLAYER &&
                    mBoard[i + 3] == HUMAN_PLAYER &&
                    mBoard[i + 6] == HUMAN_PLAYER)
                return 2;
            if (mBoard[i] == COMPUTER_PLAYER &&
                    mBoard[i + 3] == COMPUTER_PLAYER &&
                    mBoard[i + 6] == COMPUTER_PLAYER)
                return 3;
        }

        // Check for diagonal wins
        if ((mBoard[0] == HUMAN_PLAYER &&
                mBoard[4] == HUMAN_PLAYER &&
                mBoard[8] == HUMAN_PLAYER) ||
                (mBoard[2] == HUMAN_PLAYER &&
                        mBoard[4] == HUMAN_PLAYER &&
                        mBoard[6] == HUMAN_PLAYER))
            return 2;
        if ((mBoard[0] == COMPUTER_PLAYER &&
                mBoard[4] == COMPUTER_PLAYER &&
                mBoard[8] == COMPUTER_PLAYER) ||
                (mBoard[2] == COMPUTER_PLAYER &&
                        mBoard[4] == COMPUTER_PLAYER &&
                        mBoard[6] == COMPUTER_PLAYER))
            return 3;

        // Check for tie
        for (int i = 0; i < BOARD_SIZE; i++) {
            // If we find a number, then no one has won yet
            if (mBoard[i] != HUMAN_PLAYER && mBoard[i] != COMPUTER_PLAYER)
                return 0;
        }

        // If we make it through the previous loop, all places are taken, so it's a tie
        return 1;
    }


    private void getComputerMove() {

        int move;

        // First see if there's a move O can make to win
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (mBoard[i] != HUMAN_PLAYER && mBoard[i] != COMPUTER_PLAYER) {
                char curr = mBoard[i];
                mBoard[i] = COMPUTER_PLAYER;
                if (checkForWinner() == 3) {
                    System.out.println("Computer is moving to " + (i + 1));
                    mBoardButtons[i].setText("O");
                    return;
                } else
                    mBoard[i] = curr;
            }
        }

        // See if there's a move O can make to block X from winning
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (mBoard[i] != HUMAN_PLAYER && mBoard[i] != COMPUTER_PLAYER) {
                char curr = mBoard[i];   // Save the current number
                mBoard[i] = HUMAN_PLAYER;
                if (checkForWinner() == 2) {
                    mBoard[i] = COMPUTER_PLAYER;
                    System.out.println("Computer is moving to " + (i + 1));
                    mBoardButtons[i].setText("O");
                    return;
                } else
                    mBoard[i] = curr;
            }
        }

        // Generate random move
        do {
            move = mRand.nextInt(BOARD_SIZE);
        } while (mBoard[move] == HUMAN_PLAYER || mBoard[move] == COMPUTER_PLAYER);

        System.out.println("Computer is moving to " + (move + 1));
        mBoardButtons[move].setText("O");
        mBoard[move] = COMPUTER_PLAYER;

    }


}
