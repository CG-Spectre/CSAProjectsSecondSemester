/**
 * This represents a basic square tile game that utilizes NumberTile objects
 * 
 * @author 
 * @version 
 */
import java.util.ArrayList;

public class TileGame
{
    /** represents the game board; guaranteed never to be null */
    private ArrayList<NumberTile> board;

    public TileGame()
    {
        board = new ArrayList<NumberTile>();
    }

    /** Determines where to insert tile, in its current orientation, into game board.
     *  @param tile the tile to be placed on the game board
     *  @return the position of tile where tile is to be inserted:
     *        0 if the board is empty;
     *       -1 if tile does not fit in front, at end, or between any existing tiles;
     *        otherwise, 0 <= position returned <= board.size()
     */
    public int getIndexForFit(NumberTile tile)
    {
        // There are five possible outcomes for finding a position to insert a tile
        // Note: attempt to fit the tile as is, without rotating it

        //    1) if there are no other tiles on the game board, it fits at position 0 
        if(board.size() == 0){
            return 0;
        }
        //    2) perhaps it fits before the first game board tile (far left side)
        if(board.get(0).getLeft() == tile.getRight()){
            return 0;
        }
        //    3) perhaps it fits after the last game board tile (far right side)
        if(board.get(board.size() - 1).getRight() == tile.getLeft()){
            return board.size();
        }
        //    4) perhaps it fits somewhere in the middle of the game board
        
        for(int i = 1; i < board.size(); i++){
            NumberTile iTile = board.get(i);
            if(iTile.getLeft() == tile.getRight() && tile.getLeft() == board.get(i-1).getRight()){
                return i;
            }else if(iTile.getRight() == tile.getLeft() && tile.getRight() == board.get(i+1).getLeft()){
                return i + 1;
            }
        }
        
        //    5) if none of the above, then it does not fit anywhere on the game board
        return -1;
    }

    /** Places tile on the game board if it fits (checking all possible orientations if necessary.
     *  If there are no tiles on the game board, the tile is placed at position 0.
     *  The tile should be placed at most 1 time.
     *  Precondition: board is not null
     *  @param tile the tile to be placed on the game board
     *  @return true if tile is placed successfully; false otherwise
     *  Postcondition: the orientation of the other tiles on the board are not changed.
     *  Postcondition: the order of the other tiles on the board relative to each other is not changed.
     */
    public boolean insertTile(NumberTile tile)
    {
        for(int i = 0; i < 4; i++){
            int fit = getIndexForFit(tile);
            if(fit != -1){
                board.add(fit, tile);
                return true;
            }
            tile.rotate();
        }
        return false;
    }
}
