class tvRemote{
    void onButton(){
        System.out.println(" switch on the TV ");
    }
    void nextButton(){
        System.out.println("change to the next channel");
    }
    void prevButton(){
        System.out.println("change to the previous channel");
    }
  public static class smartTvRemote extends tvRemote{
        void playButton(){
            System.out.println("play the ott platforms & youtube");
        }
        void castButton(){
            System.out.println("for switch on the mirror cast");
        }
    }
    class tv extends smartTvRemote{
        @Override
        void onButton() {
            System.out.println("tv will switch on");
        }

        @Override
        void nextButton() {
            super.nextButton();
        }

        @Override
        void prevButton() {
            super.prevButton();
        }
    }
}

public class practice_11_inheritance {
    public static void main(String[] args) {
        tvRemote remote = new tvRemote();
        tvRemote.smartTvRemote sRemote = new tvRemote.smartTvRemote();
        sRemote.onButton();
        sRemote.castButton();
        sRemote.prevButton();
        sRemote.nextButton();
        sRemote.playButton();
    }
}
