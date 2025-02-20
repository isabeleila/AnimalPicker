import java.util.Scanner;
public class AnimalPicker{
public static void main (String args[]){
    Scanner scan = new Scanner(System.in);
    String catOdog;
    
    do{
        System.out.println("Would you like to see a dog or a cat?");
         catOdog = scan.nextLine().toLowerCase();

        if(!catOdog.equals("cat") && !catOdog.equals("dog")){
            System.out.println("Invalid response entered. Please enter either 'cat' or 'dog'" );
        }
    } while (!catOdog.equals("cat") && !catOdog.equals("dog"));
    if(catOdog.equals("cat")){
        System.out.println("                             .                                   \n                          ,\'\'`.         _                        \n                     ,.,\'\'\'  \'`--- ._,,\'|                        \n                   ,\'                   /                        \n              __.-\'                    |                         \n           \'\'                ___   ___ |                         \n         ,\'                  \\(|\\ /|)/ |                         \n        ,\'                 _     _     `._                       \n       /     ,.......-\\    `.      __     `-.                    \n      /     ,\' :  .:\'\'`|    `:`.../:.`` ._   `._                 \n  ,..,\'  _/\' .: :\'     |     |      \'.    \\.    \\                \n /      ,\'  :\'.:  / \\  |     | / \\   \':.  . \\    \\               \n|      /  .: :\' ,\'  _)  \".._,;\'  _)    :. :. \\    |              \n |     | :\'.:  /   |   .,   /   |       :  :  |   |              \n |     |:\' :  /____|  /  \\ /____|       :  :  |  ,\'              \n  |   /    \'         /    \\            :\'   : |,/                \n   \\ |  \'_          /______\\              , : |                  \n  _/ |  \\\'`--`.    _            ,_   ,-\'\'\'  :.|         __       \n /   |   \\..   ` ./ `.   _,_  ,\'  ``\'  /\'   :\'|      _,\'\'/       \n/   /\'. :   \\.   _    [_]   `[_]  .__,,|   _....,--=/\'  /:       \n|   \\_| :    `.-\' `.    _.._     /     . ,\'  :. \':/\'  /\'  `.     \n`.   \'`\'`.         `. ,.\'   ` .,\'     :\'/ \':..\':.    |  .:\' `.   \n  \\.      \\          \'               :\' |    \'\'\'\'      \'\'     `. \n    `\'\'.   `|        \':     .      .:\' ,|         .  ..\':.      |\n      /\'   / \'\"-..._  :   .:\'    _;:.,\'  \\.     .:\'   :. \'\'.    |\n     (._,.\'        \'`\'\'\'\'\'\'\'\'\'\'\'\'          \\.._.:      \':  \':   /\n________                                      \'`- ._    ,:__,,-\' ");
    } else{
        System.out.println("  ,_-~~~-,    _-~~-_\n /        ^-_/      \\_    _-~-.\n|      /\\  ,          `-_/     \\\n|   /~^\\ \'/  /~\\  /~\\   / \\_    \\\n \\_/    }/  /        \\  \\ ,_\\    }\n        Y  /  /~  /~  |  Y   \\   |\n       /   | {Q) {Q)  |  |    \\_/\n       |   \\  _===_  /   |\n       /  >--{     }--<  \\\n     /~       \\_._/       ~\\\n    /    *  *   Y    *      \\\n    |      * .: | :.*  *    |\n    \\    )--__==#==__--     /\n     \\_      \\  \\  \\      ,/\n       \'~_    | |  }   ,~\'\n          \\   {___/   /\n           \\   ~~~   /\n           /\\._._._./\\\n          {    ^^^    }\n           ~-_______-~\n            /       \\");
}
}
}