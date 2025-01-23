package BasicCodingStudy.collections.compare.test;

public class CardGameMain {

    public static void main(String[] args) {


        Deck deck = new Deck();
        Player player1 = new Player("플레이어1");
        Player player2 = new Player("플레이어2");

        for(int i =0; i<5 ;i++){
            player1.drawCard(deck);
            player2.drawCard(deck);
        }

        player1.showHand();
        player2.showHand();

        //변수를 선언하고 바로 값을 세팅하지 않으면 중간에 불안정하게 존재하는 구간이 있다.
        //이 구간을 없애기 위해선 메서드로 과정을 따로 빼서 값을 넣어주는 방법이 있다.
        Player winner = getWinner(player1,player2);
        if(winner != null){
            System.out.println(winner.getName() + " 승리");
        }else{
            System.out.println("무승부");
        }
    }

    private static Player getWinner(Player player1, Player player2){
        int sum1 = player1.rankSum();
        int sum2 = player2.rankSum();

        if(sum1>sum2){
            return player1;
        }else if(sum1==sum2){
            return null;
        }else{
            return player2;
        }
    }
}
