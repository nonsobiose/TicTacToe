package com.nonsobiose.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.nonsobiose.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Declares a boolean variable for player 1 and sets its playing status to true
    //Hint: Player one always plays first
    private boolean isPlayerOneTurn = true;

    //Declares a boolean variable for player 2 and sets its playing status to false
    private boolean isPlayerTwoTurn = false;

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

    //Checks each index in the multi-dimensional array to see if any has been filled up consecutively by a player
    private void checkForPlayerWin(int playerSymbol) {
        //Checks top/first row
        if (cells[0][0] == playerSymbol) {
            if (cells[0][1] == playerSymbol) {
                if (cells[0][2] == playerSymbol) {
                    Toast.makeText(getApplicationContext(), "Player One has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }

        //Checks middle/second row
        if (cells[1][0] == playerSymbol) {
            if (cells[1][1] == playerSymbol) {
                if (cells[1][2] == playerSymbol) {
                    Toast.makeText(getApplicationContext(), "Player One has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }

        //Checks last/third row
        if (cells[2][0] == playerSymbol) {
            if (cells[2][1] == playerSymbol) {
                if (cells[2][2] == playerSymbol) {
                    Toast.makeText(getApplicationContext(), "Player One has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }

        //Checks left/first column
        if (cells[0][0] == playerSymbol) {
            if (cells[1][0] == playerSymbol) {
                if (cells[2][0] == playerSymbol) {
                    Toast.makeText(getApplicationContext(), "Player One has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }

        //Checks middle/second column
        if (cells[0][1] == playerSymbol) {
            if (cells[1][1] == playerSymbol) {
                if (cells[2][1] == playerSymbol) {
                    Toast.makeText(getApplicationContext(), "Player One has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }

        //Checks last/right column
        if (cells[0][2] == playerSymbol) {
            if (cells[1][2] == playerSymbol) {
                if (cells[2][2] == playerSymbol) {
                    Toast.makeText(getApplicationContext(), "Player One has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }

        //Checks diagonal cells from the top left to the bottom right
        if (cells[0][0] == playerSymbol) {
            if (cells[1][1] == playerSymbol) {
                if (cells[2][2] == playerSymbol) {
                    Toast.makeText(getApplicationContext(), "Player One has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }


        //Checks diagonal cells from the bottom left to the top right
        if (cells[2][0] == playerSymbol) {
            if (cells[1][1] == playerSymbol) {
                if (cells[0][2] == playerSymbol) {
                    Toast.makeText(getApplicationContext(), "Player One has won", Toast.LENGTH_SHORT).show();
                    restart(findViewById(R.id.restart));
                }
            }
        }
    }

    //Sets all cells back to default empty background
    public void restart(View view) {
        recreate();
    }

    @Override
    public void onClick(View view) {
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
            // Represents playerOne in the backing multi-dimensional array
            int PLAYER_ONE_SYMBOL = 1;
            cells[cellPositionX][cellPositionY] = PLAYER_ONE_SYMBOL;
            checkForPlayerWin(PLAYER_ONE_SYMBOL);
            isPlayerOneTurn = false;
            isPlayerTwoTurn = true;
            playerStatusDisplay.setText(R.string.player_two_turn);
            cell.setClickable(false);
        } else if (isPlayerTwoTurn) {
            cell.setImageResource(R.drawable.player_two_mark);
            // Represents playerTwo in the backing multi-dimensional array
            int PLAYER_TWO_SYMBOL = 2;
            cells[cellPositionX][cellPositionY] = PLAYER_TWO_SYMBOL;
            checkForPlayerWin(PLAYER_TWO_SYMBOL);
            isPlayerOneTurn = true;
            isPlayerTwoTurn = false;
            playerStatusDisplay.setText(R.string.player_one_turn);
            cell.setClickable(false);
        }
    }
}
