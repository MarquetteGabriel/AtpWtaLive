package fr.gmarquette.aptwtalive.model.season;

class Score
{
    int playerOneSetOne, playerOneSetTwo, playerOneSetThree, playerOneSetFour, playerOneSetFive;
    int playerTwoSetOne, playerTwoSetTwo, playerTwoSetThree, playerTwoSetFour, playerTwoSetFive;

    public Score()
    {
        playerOneSetOne = playerOneSetTwo = playerOneSetThree = playerOneSetFour = playerOneSetFive = 0;
        playerTwoSetOne = playerTwoSetTwo = playerTwoSetThree = playerTwoSetFour = playerTwoSetFive = 0;
    }

    public Score getScore()
    {
        return this;
    }

    public int getPlayerOneSetOne() {
        return playerOneSetOne;
    }

    public void setPlayerOneSetOne(int playerOneSetOne) {
        this.playerOneSetOne = playerOneSetOne;
    }

    public int getPlayerOneSetTwo() {
        return playerOneSetTwo;
    }

    public void setPlayerOneSetTwo(int playerOneSetTwo) {
        this.playerOneSetTwo = playerOneSetTwo;
    }

    public int getPlayerOneSetThree() {
        return playerOneSetThree;
    }

    public void setPlayerOneSetThree(int playerOneSetThree) {
        this.playerOneSetThree = playerOneSetThree;
    }

    public int getPlayerOneSetFour() {
        return playerOneSetFour;
    }

    public void setPlayerOneSetFour(int playerOneSetFour) {
        this.playerOneSetFour = playerOneSetFour;
    }

    public int getPlayerOneSetFive() {
        return playerOneSetFive;
    }

    public void setPlayerOneSetFive(int playerOneSetFive) {
        this.playerOneSetFive = playerOneSetFive;
    }

    public int getPlayerTwoSetOne() {
        return playerTwoSetOne;
    }

    public void setPlayerTwoSetOne(int playerTwoSetOne) {
        this.playerTwoSetOne = playerTwoSetOne;
    }

    public int getPlayerTwoSetTwo() {
        return playerTwoSetTwo;
    }

    public void setPlayerTwoSetTwo(int playerTwoSetTwo) {
        this.playerTwoSetTwo = playerTwoSetTwo;
    }

    public int getPlayerTwoSetThree() {
        return playerTwoSetThree;
    }

    public void setPlayerTwoSetThree(int playerTwoSetThree) {
        this.playerTwoSetThree = playerTwoSetThree;
    }

    public int getPlayerTwoSetFour() {
        return playerTwoSetFour;
    }

    public void setPlayerTwoSetFour(int playerTwoSetFour) {
        this.playerTwoSetFour = playerTwoSetFour;
    }

    public int getPlayerTwoSetFive() {
        return playerTwoSetFive;
    }

    public void setPlayerTwoSetFive(int playerTwoSetFive) {
        this.playerTwoSetFive = playerTwoSetFive;
    }
}
