package utils;

import entities.User;
import facades.UserFacade;

import javax.persistence.EntityManagerFactory;

public class Populator {
    public static void main(String[] args) {
        populate();
    }
public static void populate(){
    EntityManagerFactory emf = EMF_Creator.createEntityManagerFactory();
 /*   locationFacade.createLocation(new Location("Royal Arena", "Copenhagen","Prestine"));
    MatchFacade matchFacade = MatchFacade.getmatchFacade(emf);
    Match newMatch = new Match("The Wild Wagons", "Judge Dredd", "Badminton", true, 1);
    matchFacade.creatematch(newMatch);
    PlayerFacade playerFacade = PlayerFacade.getplayerFacade(emf);
    Player newPlayer = new Player("Anders Meinicke", "anders@meinicke.dk",12345678, "Avaliable");
    newPlayer.addPlayerMatch(newMatch);
    playerFacade.createplayer(newPlayer);
*/
    UserFacade userFacade = UserFacade.getUserFacade(emf);
    User user = new User("Anders","test1");
    userFacade.createUser(user,null);



}
}
