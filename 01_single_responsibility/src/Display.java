public class Display {

    public void display(Board b) {
        String formattedFirstRow = b.spots.get(0) + " | " + b.spots.get(1) + " | " + b.spots.get(2) + "\n"
                + b.spots.get(3) + " | " + b.spots.get(4) + " | " + b.spots.get(5) + "\n"
                + b.spots.get(6) + " | " + b.spots.get(7) + " | " + b.spots.get(8);
        System.out.print(formattedFirstRow);
    }

    // main() method for testing/checking
    public static void main(String[] args) {
        Board board = new Board();
        Display displayBoard = new Display();
        displayBoard.display(board);
    }
}
