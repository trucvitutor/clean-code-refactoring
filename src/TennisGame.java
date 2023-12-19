public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int m_score1, int m_score2) {
        String score = "";
        String all="-All";
        String love="Love";
        String fifteen="Fifteen";
        String thirty="Thirty";
        String forty="Forty";

        int tempScore=0;
        if (m_score1==m_score2)
        {
            switch (m_score1)
            {
                case 0:
                    score = love+all;
                    break;
                case 1:
                    score = fifteen+all;
                    break;
                case 2:
                    score = thirty+all;
                    break;
                case 3:
                    score = forty+all;
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        else if (m_score1>=4 || m_score2>=4)
        {
            int minusResult = m_score1-m_score2;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = m_score1;
                else { score+="-"; tempScore = m_score2;}
                switch(tempScore)
                {
                    case 0:
                        score+=love;
                        break;
                    case 1:
                        score+=fifteen;
                        break;
                    case 2:
                        score+=thirty;
                        break;
                    case 3:
                        score+=forty;
                        break;
                }
            }
        }
        return score;
    }
}
