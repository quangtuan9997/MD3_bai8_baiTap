public class TennisGame {
    public static String getScore(String playName1,String playName2,int mScore1, int mScore2 ){
        String score="";
        int tempScore=0;
        if(mScore1==mScore2) {
            switch (mScore1){
                case 0:
                    score ="Love-All";
                    break;
                case 1:
                    score="Fifteen-All";
                    break;
                case 2:
                    score="Thirty-All";
                    break;
                case 3:
                    score="Forty_ALL";
                    break;
                default:
                    score="Deuce";
                    break;
            }
        }
        else if (mScore1>=4 || mScore2>=4){
            int minusResult =mScore1 -mScore2;
            if (minusResult==1) score="Advantage play1";
            else if (minusResult==-1) score="Advantage play2";
            else if (minusResult>=2) score ="win for play1";
            else score ="win for play2";
        }
        else {
            for (int i=1;i<3;i++){
                if (i==1) tempScore = mScore1;
                else { score+="-"; tempScore = mScore2;}
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }

}
