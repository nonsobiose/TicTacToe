package com.pisure.TicTacToe;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Declares a boolean variable for player 1 and sets its playing status to true
    //Hint: Player one always plays first
    private boolean isPlayerOneTurn = true;

    // Represents playerOne in the backing multi-dimensional array
    private final int PLAYER_ONE_SYMBOL = 1;

    //Declares a boolean variable for player 2 and sets its playing status to false
    private boolean isPlayerTwoTurn = false;

    // Represents playerGTwo in the backing multi-dimensional array
    private int PLAYER_TWO_SYMBOL = 2;

    //Declares and sets up a multi-dimensional array which represents each cell on the tic_tac_toe board
    private int[][] cells = new int[3][3];

    // Cells on the first row
    ImageView cell_zero_zero;
    ImageView cell_zero_one;
    ImageView cell_zero_two;

    // Cells on the second row
    ImageView cell_one_zero;
    ImageView cell_one_one;
    ImageView cell_one_two;

    // Cells on the third row
    ImageView cell_two_zero;
    ImageView cell_two_one;
    ImageView cell_two_two;

    // Displays the current players turn
    TextView playerStatusDisplay;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializes cells on the first row
        cell_zero_zero = findViewById(R.id.cell_zero_zero);
        cell_zero_one = findViewById(R.id.cell_zero_one);
        cell_zero_two = findViewById(R.id.cell_zero_two);

        // Initializes cells on the second row
        cell_one_zero = findViewById(R.id.cell_one_zero);
        cell_one_one = findViewById(R.id.cell_one_one);
        cell_one_two = findViewById(R.id.cell_one_two);

        // Initializes cells on the third row
        cell_two_zero = findViewById(R.id.cell_two_zero);
        cell_two_one = findViewById(R.id.cell_two_one);
        cell_two_two = findViewById(R.id.cell_two_two);

        //Initializes the display for the current players turn
        playerStatusDisplay = findViewById(R.id.players_turn);

        //Player 1 starts first so, its set to Player One
        playerStatusDisplay.setText(R.string.player_one_turn);

        // Registers onClickListeners for each cell
        cell_zero_zero.setOnClickListener(this);
        cell_zero_one.setOnClickListener(this);
        cell_zero_two.setOnClickListener(this);
        cell_one_zero.setOnClickListener(this);
        cell_one_one.setOnClickListener(this);
        cell_one_two.setOnClickListener(this);
        cell_two_zero.setOnClickListener(this);
        cell_two_one.setOnClickListener(this);
        cell_two_two.setOnClickListener(this);

    }

    //Checks each index in the multi-dimensional array to see if any has been filled up consecutively
    //with a number "1"
    //i.e the representation of the cells marked by player 1
    //if true, then a toast message is displayed for player 1
    private void checkCellsForPlayerOne() {
        //Checks top/first row
        if (cells[0][0] == PLAYER_ONE_SYMBOL) {
            if (cells[0][1] == PLAYER_ONE_SYMBOL) {
                if (cells[0][2] == PLAYER_ONE_SYMBOL) {
                    Toast.makeText(getApplicationContext(), "Player One has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }

        //Checks middle/second row
        if (cells[1][0] == PLAYER_ONE_SYMBOL) {
            if (cells[1][1] == PLAYER_ONE_SYMBOL) {
                if (cells[1][2] == PLAYER_ONE_SYMBOL) {
                    Toast.makeText(getApplicationContext(), "Player One has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }

        //Checks last/third row
        if (cells[2][0] == PLAYER_ONE_SYMBOL) {
            if (cells[2][1] == PLAYER_ONE_SYMBOL) {
                if (cells[2][2] == PLAYER_ONE_SYMBOL) {
                    Toast.makeText(getApplicationContext(), "Player One has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }

        //Checks left/first column
        if (cells[0][0] == PLAYER_ONE_SYMBOL) {
            if (cells[1][0] == PLAYER_ONE_SYMBOL) {
                if (cells[2][0] == PLAYER_ONE_SYMBOL) {
                    Toast.makeText(getApplicationContext(), "Player One has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }

        //Checks middle/second column
        if (cells[0][1] == PLAYER_ONE_SYMBOL) {
            if (cells[1][1] == PLAYER_ONE_SYMBOL) {
                if (cells[2][1] == PLAYER_ONE_SYMBOL) {
                    Toast.makeText(getApplicationContext(), "Player One has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }

        //Checks last/right column
        if (cells[0][2] == PLAYER_ONE_SYMBOL) {
            if (cells[1][2] == PLAYER_ONE_SYMBOL) {
                if (cells[2][2] == PLAYER_ONE_SYMBOL) {
                    Toast.makeText(getApplicationContext(), "Player One has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }

        //Checks diagonal cells from the top left to the bottom right
        if (cells[0][0] == PLAYER_ONE_SYMBOL) {
            if (cells[1][1] == PLAYER_ONE_SYMBOL) {
                if (cells[2][2] == PLAYER_ONE_SYMBOL) {
                    Toast.makeText(getApplicationContext(), "Player One has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }


        //Checks diagonal cells from the bottom left to the top right
        if (cells[2][0] == PLAYER_ONE_SYMBOL) {
            if (cells[1][1] == PLAYER_ONE_SYMBOL) {
                if (cells[0][2] == PLAYER_ONE_SYMBOL) {
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
        if (cells[0][0] == PLAYER_TWO_SYMBOL) {
            if (cells[0][1] == PLAYER_TWO_SYMBOL) {
                if (cells[0][2] == PLAYER_TWO_SYMBOL) {
                    Toast.makeText(getApplicationContext(), "Player Two has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }

        //Checks middle/second row
        if (cells[1][0] == PLAYER_TWO_SYMBOL) {
            if (cells[1][1] == PLAYER_TWO_SYMBOL) {
                if (cells[1][2] == PLAYER_TWO_SYMBOL) {
                    Toast.makeText(getApplicationContext(), "Player Two has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }

        //Checks last/third row
        if (cells[2][0] == PLAYER_TWO_SYMBOL) {
            if (cells[2][1] == PLAYER_TWO_SYMBOL) {
                if (cells[2][2] == PLAYER_TWO_SYMBOL) {
                    Toast.makeText(getApplicationContext(), "Player Two has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }

        //Checks left/first column
        if (cells[0][0] == PLAYER_TWO_SYMBOL) {
            if (cells[1][0] == PLAYER_TWO_SYMBOL) {
                if (cells[2][0] == PLAYER_TWO_SYMBOL) {
                    Toast.makeText(getApplicationContext(), "Player Two has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }

        //Checks middle/second column
        if (cells[0][1] == PLAYER_TWO_SYMBOL) {
            if (cells[1][1] == PLAYER_TWO_SYMBOL) {
                if (cells[2][1] == PLAYER_TWO_SYMBOL) {
                    Toast.makeText(getApplicationContext(), "Player Two has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }

        //Checks last/right column
        if (cells[0][2] == PLAYER_TWO_SYMBOL) {
            if (cells[1][2] == PLAYER_TWO_SYMBOL) {
                if (cells[2][2] == PLAYER_TWO_SYMBOL) {
                    Toast.makeText(getApplicationContext(), "Player Two has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }

        //Checks diagonal cells from the top left to the bottom right
        if (cells[0][0] == PLAYER_TWO_SYMBOL) {
            if (cells[1][1] == PLAYER_TWO_SYMBOL) {
                if (cells[2][2] == PLAYER_TWO_SYMBOL) {
                    Toast.makeText(getApplicationContext(), "Player Two has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }

        //Checks diagonal cells from the bottom left to the top right
        if (cells[2][0] == PLAYER_TWO_SYMBOL) {
            if (cells[1][1] == PLAYER_TWO_SYMBOL) {
                if (cells[0][2] == PLAYER_TWO_SYMBOL) {
                    Toast.makeText(getApplicationContext(), "Player Two has won", Toast.LENGTH_SHORT).show();
                   restart(findViewById(R.id.restart));
                }
            }
        }

    }

    public void restart(View view) {
        //Sets the players play status text to default player one
        playerStatusDisplay.setText(R.string.player_one_turn);

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

    @Override
    public void onClick(View view) {
        Log.e("CLICKED CLICKED", "I WAS CLICKED");
        ImageView cell = (ImageView) view;
        String cellTag = cell.getTag().toString();
        switch (cellTag) {
            case "00" :
                doPlayerAction(cell, 0, 0);
                break;
            case "01":
                doPlayerAction(cell, 0, 1);
                break;
            case "02":
                doPlayerAction(cell, 0, 2);
                break;
            case "10":
                doPlayerAction(cell, 1, 0);
                break;
            case "11":
                doPlayerAction(cell, 1, 1);
                break;
            case "12":
                doPlayerAction(cell, 1, 2);
                break;
            case "20":
                doPlayerAction(cell, 2, 0);
                break;
            case "21":
                doPlayerAction(cell, 2, 1);
                break;
            case "22":
                doPlayerAction(cell, 2, 2);
                break;
            default:
                Toast.makeText(this, "Wrong cell selected", Toast.LENGTH_LONG).show();
        }

    }

    /**
     * This method handles actions for a player, by setting the appropriate image on the cell, storing the corresponding position in the
     * backing array and then switching player turns and display text
     * @param cell where player's symbol is played
     * @param cellPositionX position on the cell
     * @param cellPositionY position on the cell
     */
    private void doPlayerAction(ImageView cell, int cellPositionX, int cellPositionY) {
        if (isPlayerOneTurn) {
            cell.setImageResource(R.drawable.player_one_mark);
            cells[cellPositionX][cellPositionY] = PLAYER_ONE_SYMBOL;
            checkCellsForPlayerOne();
            isPlayerOneTurn = false;
            isPlayerTwoTurn = true;
            playerStatusDisplay.setText(R.string.player_two_turn);
            cell.setClickable(false);
        } else if (isPlayerTwoTurn) {
            cell.setImageResource(R.drawable.player_two_mark);
            cells[cellPositionX][cellPositionY] = PLAYER_TWO_SYMBOL;
            checkCellsForPlayerTwo();
            isPlayerOneTurn = true;
            isPlayerTwoTurn = false;
            playerStatusDisplay.setText(R.string.player_one_turn);
            cell.setClickable(false);
        }
    }
}
