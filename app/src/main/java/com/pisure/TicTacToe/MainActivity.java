package com.pisure.TicTacToe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    //Declares a boolean variable for player 1 and sets its playing status to true
    //Hint: Player one always plays first
    private boolean isPlayerOneTurn = true;

    //Declares a boolean variable for player 2 and sets its playing status to false
    private boolean isPlayerTwoTurn = false;

    //Declares and sets up a multi-dimensional array which represents each cell in the tic_tac_toe board
    private int[][] cells = new int[3][3];

    //Declares object references for each imageView in the first row
    ImageView cell_zero_zero;
    ImageView cell_zero_one;
    ImageView cell_zero_two;

    //Declares object references for each imageView in the second row
    ImageView cell_one_zero;
    ImageView cell_one_one;
    ImageView cell_one_two;

    //Declares object references for each imageView in the third row
    ImageView cell_two_zero;
    ImageView cell_two_one;
    ImageView cell_two_two;

    //Declares object reference that displays the current players turn
    TextView playerStatus;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initializes the object references for each imageView in the first row
        cell_zero_zero = (ImageView) findViewById(R.id.cell_zero_zero);
        cell_zero_one = (ImageView) findViewById(R.id.cell_zero_one);
        cell_zero_two = (ImageView) findViewById(R.id.cell_zero_two);

        //Initializes the object references for each imageView in the second row
        cell_one_zero = (ImageView) findViewById(R.id.cell_one_zero);
        cell_one_one = (ImageView) findViewById(R.id.cell_one_one);
        cell_one_two = (ImageView) findViewById(R.id.cell_one_two);

        //Initializes the object references for each imageView in the third row
        cell_two_zero = (ImageView) findViewById(R.id.cell_two_zero);
        cell_two_one = (ImageView) findViewById(R.id.cell_two_one);
        cell_two_two = (ImageView) findViewById(R.id.cell_two_two);

        //Initializes the object reference that displays the current players turn
        playerStatus = (TextView) findViewById(R.id.players_turn);

        //Player 1 starts first so, its set on him
        playerStatus.setText(R.string.player_one_turn);

        //Registers onClickListeners for each imageView
        //checks the current player status, if true
        //gets and sets an image on the current ImageView
        //initializes the corresponding index in the multi-dimensional array with the
        //number value based the current player
        //and then changes the current players status to false, next players play status to true
        //finally disables click on the current imageView

        cell_zero_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPlayerOneTurn) {
                    cell_zero_zero.setImageResource(R.drawable.player_one_mark);
                    cells[0][0] = 1;
                    checkCellsForPlayerOne();
                    isPlayerOneTurn = false;
                    isPlayerTwoTurn = true;
                    playerStatus.setText(R.string.player_two_turn);
                    cell_zero_zero.setClickable(false);
                } else if (isPlayerTwoTurn) {
                    cell_zero_zero.setImageResource(R.drawable.player_two_mark);
                    cells[0][0] = 2;
                    checkCellsForPlayerTwo();
                    isPlayerOneTurn = true;
                    isPlayerTwoTurn = false;
                    playerStatus.setText(R.string.player_one_turn);
                    cell_zero_zero.setClickable(false);
                }
            }
        });

        cell_zero_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPlayerOneTurn) {
                    cell_zero_one.setImageResource(R.drawable.player_one_mark);
                    cells[0][1] = 1;
                    checkCellsForPlayerOne();
                    isPlayerOneTurn = false;
                    isPlayerTwoTurn = true;
                    playerStatus.setText(R.string.player_two_turn);
                    cell_zero_one.setClickable(false);
                } else if (isPlayerTwoTurn) {
                    cell_zero_one.setImageResource(R.drawable.player_two_mark);
                    cells[0][1] = 2;
                    checkCellsForPlayerTwo();
                    isPlayerOneTurn = true;
                    isPlayerTwoTurn = false;
                    playerStatus.setText(R.string.player_one_turn);
                    cell_zero_one.setClickable(false);
                }
            }
        });

        cell_zero_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPlayerOneTurn) {
                    cell_zero_two.setImageResource(R.drawable.player_one_mark);
                    cells[0][2] = 1;
                    checkCellsForPlayerOne();
                    isPlayerOneTurn = false;
                    isPlayerTwoTurn = true;
                    playerStatus.setText(R.string.player_two_turn);
                    cell_zero_two.setClickable(false);
                } else if (isPlayerTwoTurn) {
                    cell_zero_two.setImageResource(R.drawable.player_two_mark);
                    cells[0][2] = 2;
                    checkCellsForPlayerTwo();
                    isPlayerOneTurn = true;
                    isPlayerTwoTurn = false;
                    playerStatus.setText(R.string.player_one_turn);
                    cell_zero_two.setClickable(false);
                }
            }
        });

        cell_one_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPlayerOneTurn) {
                    cell_one_zero.setImageResource(R.drawable.player_one_mark);
                    cells[1][0] = 1;
                    checkCellsForPlayerOne();
                    isPlayerOneTurn = false;
                    isPlayerTwoTurn = true;
                    playerStatus.setText(R.string.player_two_turn);
                    cell_one_zero.setClickable(false);
                } else if (isPlayerTwoTurn) {
                    cell_one_zero.setImageResource(R.drawable.player_two_mark);
                    cells[1][0] = 2;
                    checkCellsForPlayerTwo();
                    isPlayerOneTurn = true;
                    isPlayerTwoTurn = false;
                    playerStatus.setText(R.string.player_one_turn);
                    cell_one_zero.setClickable(false);
                }
            }
        });

        cell_one_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPlayerOneTurn) {
                    cell_one_one.setImageResource(R.drawable.player_one_mark);
                    cells[1][1] = 1;
                    checkCellsForPlayerOne();
                    isPlayerOneTurn = false;
                    isPlayerTwoTurn = true;
                    playerStatus.setText(R.string.player_two_turn);
                    cell_one_one.setClickable(false);
                } else if (isPlayerTwoTurn) {
                    cell_one_one.setImageResource(R.drawable.player_two_mark);
                    cells[1][1] = 2;
                    checkCellsForPlayerTwo();
                    isPlayerOneTurn = true;
                    isPlayerTwoTurn = false;
                    playerStatus.setText(R.string.player_one_turn);
                    cell_one_one.setClickable(false);
                }
            }
        });

        cell_one_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPlayerOneTurn) {
                    cell_one_two.setImageResource(R.drawable.player_one_mark);
                    cells[1][2] = 1;
                    checkCellsForPlayerOne();
                    isPlayerOneTurn = false;
                    isPlayerTwoTurn = true;
                    playerStatus.setText(R.string.player_two_turn);
                    cell_one_two.setClickable(false);
                } else if (isPlayerTwoTurn) {
                    cell_one_two.setImageResource(R.drawable.player_two_mark);
                    cells[1][2] = 2;
                    checkCellsForPlayerTwo();
                    isPlayerOneTurn = true;
                    isPlayerTwoTurn = false;
                    playerStatus.setText(R.string.player_one_turn);
                    cell_one_two.setClickable(false);
                }
            }
        });

        cell_two_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPlayerOneTurn) {
                    cell_two_zero.setImageResource(R.drawable.player_one_mark);
                    cells[2][0] = 1;
                    checkCellsForPlayerOne();
                    isPlayerOneTurn = false;
                    isPlayerTwoTurn = true;
                    playerStatus.setText(R.string.player_two_turn);
                    cell_two_zero.setClickable(false);
                } else if (isPlayerTwoTurn) {
                    cell_two_zero.setImageResource(R.drawable.player_two_mark);
                    cells[2][0] = 2;
                    checkCellsForPlayerTwo();
                    isPlayerOneTurn = true;
                    isPlayerTwoTurn = false;
                    playerStatus.setText(R.string.player_one_turn);
                    cell_two_zero.setClickable(false);
                }
            }
        });

        cell_two_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPlayerOneTurn) {
                    cell_two_one.setImageResource(R.drawable.player_one_mark);
                    cells[2][1] = 1;
                    checkCellsForPlayerOne();
                    isPlayerOneTurn = false;
                    isPlayerTwoTurn = true;
                    playerStatus.setText(R.string.player_two_turn);
                    cell_two_one.setClickable(false);
                } else if (isPlayerTwoTurn) {
                    cell_two_one.setImageResource(R.drawable.player_two_mark);
                    cells[2][1] = 2;
                    checkCellsForPlayerTwo();
                    isPlayerOneTurn = true;
                    isPlayerTwoTurn = false;
                    playerStatus.setText(R.string.player_one_turn);
                    cell_two_one.setClickable(false);
                }
            }
        });

        cell_two_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPlayerOneTurn) {
                    cell_two_two.setImageResource(R.drawable.player_one_mark);
                    cells[2][2] = 1;
                    checkCellsForPlayerOne();
                    isPlayerOneTurn = false;
                    isPlayerTwoTurn = true;
                    playerStatus.setText(R.string.player_two_turn);
                    cell_two_two.setClickable(false);
                } else if (isPlayerTwoTurn) {
                    cell_two_two.setImageResource(R.drawable.player_two_mark);
                    cells[2][2] = 2;
                    checkCellsForPlayerTwo();
                    isPlayerOneTurn = true;
                    isPlayerTwoTurn = false;
                    playerStatus.setText(R.string.player_one_turn);
                    cell_two_two.setClickable(false);
                }
            }
        });

    }

    //Checks each index in the multi-dimensional array to see if any has been filled up consecutively
    //with a number "1"
    //i.e the representation of the cells marked by player 1
    //if true, then a toast message is displayed for player 1
    private void checkCellsForPlayerOne() {
        //Checks top/first row
        if (cells[0][0] == 1) {
            if (cells[0][1] == 1) {
                if (cells[0][2] == 1) {
                    Toast.makeText(getApplicationContext(), "Player One has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }

        //Checks middle/second row
        if (cells[1][0] == 1) {
            if (cells[1][1] == 1) {
                if (cells[1][2] == 1) {
                    Toast.makeText(getApplicationContext(), "Player One has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }

        //Checks last/third row
        if (cells[2][0] == 1) {
            if (cells[2][1] == 1) {
                if (cells[2][2] == 1) {
                    Toast.makeText(getApplicationContext(), "Player One has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }

        //Checks left/first column
        if (cells[0][0] == 1) {
            if (cells[1][0] == 1) {
                if (cells[2][0] == 1) {
                    Toast.makeText(getApplicationContext(), "Player One has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }

        //Checks middle/second column
        if (cells[0][1] == 1) {
            if (cells[1][1] == 1) {
                if (cells[2][1] == 1) {
                    Toast.makeText(getApplicationContext(), "Player One has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }

        //Checks last/right column
        if (cells[0][2] == 1) {
            if (cells[1][2] == 1) {
                if (cells[2][2] == 1) {
                    Toast.makeText(getApplicationContext(), "Player One has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }

        //Checks diagonal cells from the top left to the bottom right
        if (cells[0][0] == 1) {
            if (cells[1][1] == 1) {
                if (cells[2][2] == 1) {
                    Toast.makeText(getApplicationContext(), "Player One has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }


        //Checks diagonal cells from the bottom left to the top right
        if (cells[2][0] == 1) {
            if (cells[1][1] == 1) {
                if (cells[0][2] == 1) {
                    Toast.makeText(getApplicationContext(), "Player One has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }


    }

    //Checks each index in the multi-dimensional array to see if any has been filled up consecutively
    //with a number "2"
    //i.e the representation of the cells marked by player 2
    //if true, then a toast message is displayed for player 2
    private void checkCellsForPlayerTwo() {
        //Checks top/first row
        if (cells[0][0] == 2) {
            if (cells[0][1] == 2) {
                if (cells[0][2] == 2) {
                    Toast.makeText(getApplicationContext(), "Player Two has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }

        //Checks middle/second row
        if (cells[1][0] == 2) {
            if (cells[1][1] == 2) {
                if (cells[1][2] == 2) {
                    Toast.makeText(getApplicationContext(), "Player Two has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }

        //Checks last/third row
        if (cells[2][0] == 2) {
            if (cells[2][1] == 2) {
                if (cells[2][2] == 2) {
                    Toast.makeText(getApplicationContext(), "Player Two has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }

        //Checks left/first column
        if (cells[0][0] == 2) {
            if (cells[1][0] == 2) {
                if (cells[2][0] == 2) {
                    Toast.makeText(getApplicationContext(), "Player Two has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }

        //Checks middle/second column
        if (cells[0][1] == 2) {
            if (cells[1][1] == 2) {
                if (cells[2][1] == 2) {
                    Toast.makeText(getApplicationContext(), "Player Two has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }

        //Checks last/right column
        if (cells[0][2] == 2) {
            if (cells[1][2] == 2) {
                if (cells[2][2] == 2) {
                    Toast.makeText(getApplicationContext(), "Player Two has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }

        //Checks diagonal cells from the top left to the bottom right
        if (cells[0][0] == 2) {
            if (cells[1][1] == 2) {
                if (cells[2][2] == 2) {
                    Toast.makeText(getApplicationContext(), "Player Two has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }

        //Checks diagonal cells from the bottom left to the top right
        if (cells[2][0] == 2) {
            if (cells[1][1] == 2) {
                if (cells[0][2] == 2) {
                    Toast.makeText(getApplicationContext(), "Player Two has won", Toast.LENGTH_SHORT).show();
                   restart(findViewById(R.id.restart));
                }
            }
        }

    }

    public void restart(View view) {
        //Sets the players play status text to default player one
        playerStatus.setText(R.string.player_one_turn);

        //Sets the players play turn, back to default, player one goes first
        isPlayerOneTurn = true;
        isPlayerTwoTurn = false;

        //Sets all cells back to default empty background
        cell_zero_zero.setImageResource(R.drawable.tic_tac_toe_cell_xxxhdpi);
        cell_zero_one.setImageResource(R.drawable.tic_tac_toe_cell_xxxhdpi);
        cell_zero_two.setImageResource(R.drawable.tic_tac_toe_cell_xxxhdpi);
        cell_one_zero.setImageResource(R.drawable.tic_tac_toe_cell_xxxhdpi);
        cell_one_one.setImageResource(R.drawable.tic_tac_toe_cell_xxxhdpi);
        cell_one_two.setImageResource(R.drawable.tic_tac_toe_cell_xxxhdpi);
        cell_two_zero.setImageResource(R.drawable.tic_tac_toe_cell_xxxhdpi);
        cell_two_one.setImageResource(R.drawable.tic_tac_toe_cell_xxxhdpi);
        cell_two_two.setImageResource(R.drawable.tic_tac_toe_cell_xxxhdpi);

        //Sets all cells back to clickable
        cell_zero_zero.setClickable(true);
        cell_zero_one.setClickable(true);
        cell_zero_two.setClickable(true);
        cell_one_zero.setClickable(true);
        cell_one_one.setClickable(true);
        cell_one_two.setClickable(true);
        cell_two_zero.setClickable(true);
        cell_two_one.setClickable(true);
        cell_two_two.setClickable(true);

        //Sets the cells array to a new clean slate
        cells = new int[3][3];

    }

}
