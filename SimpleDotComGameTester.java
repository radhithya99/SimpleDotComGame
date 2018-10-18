public class SimpleDotComGameTester {
    public static void main(String[] args){

        int numOfGuesses = 0;
        SimpleDotComGame dot = new SimpleDotComGame();
        GameHelper helper = new GameHelper();
        int randomNumber = (int) (Math.random() * 5);
        int[] lcells = {randomNumber, randomNumber+1, randomNumber+2};
        dot.setLocationCells(lcells);
        boolean alive = true;
        while (alive){
            String guess = helper.getUserInput("enter a number");
            numOfGuesses++;
            String result = dot.checkYourself(guess);
            if (result == "kill"){
                alive = false;
                System.out.println("Number of guesses" +numOfGuesses);
            }


        }



    }
}
