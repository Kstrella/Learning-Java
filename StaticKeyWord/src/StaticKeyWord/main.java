/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticKeyWord;

/**
 *
 * @author kevinestrella
 */
public class main {
    public static void main(String[] args)
    {
        //static = modifier. A single copy of a variable/ method is created and shared 
        // the class "owns" the static member
        Friend friend1 = new Friend("spongebob");
        Friend friend2 = new Friend("sandy");
        Friend friend3 = new Friend("parick");
        Friend friend4 = new Friend("plankton");
        //we can acess Friend.numberOfFriends because it is static
        //if not static we cand to that
        // System.out.println(Friend.numberOfFriends);
        Friend.displayFriends();
        
        System.out.println(friend1.name);
    }
}
