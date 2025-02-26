import java.util.Scanner;
public class AnimalPicker{
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        String catOdogOfish;
        
        do{
            System.out.println("Would you like to see a cat, dog, rabbit, or fish?");
            catOdogOfish = scan.nextLine().toLowerCase();

            if(!catOdogOfish.equals("cat") && !catOdogOfish.equals("dog") && !catOdogOfish.equals("fish") && !catOdogOfish.equals("rabbit")){
                System.out.println("Invalid response entered. Please enter either 'cat' or 'dog'" );
            }
        } while (!catOdogOfish.equals("cat") && !catOdogOfish.equals("dog") && !catOdogOfish.equals("fish") && !catOdogOfish.equals("rabbit"));
        if(catOdogOfish.equals("cat")){
            System.out.println("                             .                                   \n                          ,\'\'`.         _                        \n                     ,.,\'\'\'  \'`--- ._,,\'|                        \n                   ,\'                   /                        \n              __.-\'                    |                         \n           \'\'                ___   ___ |                         \n         ,\'                  \\(|\\ /|)/ |                         \n        ,\'                 _     _     `._                       \n       /     ,.......-\\    `.      __     `-.                    \n      /     ,\' :  .:\'\'`|    `:`.../:.`` ._   `._                 \n  ,..,\'  _/\' .: :\'     |     |      \'.    \\.    \\                \n /      ,\'  :\'.:  / \\  |     | / \\   \':.  . \\    \\               \n|      /  .: :\' ,\'  _)  \".._,;\'  _)    :. :. \\    |              \n |     | :\'.:  /   |   .,   /   |       :  :  |   |              \n |     |:\' :  /____|  /  \\ /____|       :  :  |  ,\'              \n  |   /    \'         /    \\            :\'   : |,/                \n   \\ |  \'_          /______\\              , : |                  \n  _/ |  \\\'`--`.    _            ,_   ,-\'\'\'  :.|         __       \n /   |   \\..   ` ./ `.   _,_  ,\'  ``\'  /\'   :\'|      _,\'\'/       \n/   /\'. :   \\.   _    [_]   `[_]  .__,,|   _....,--=/\'  /:       \n|   \\_| :    `.-\' `.    _.._     /     . ,\'  :. \':/\'  /\'  `.     \n`.   \'`\'`.         `. ,.\'   ` .,\'     :\'/ \':..\':.    |  .:\' `.   \n  \\.      \\          \'               :\' |    \'\'\'\'      \'\'     `. \n    `\'\'.   `|        \':     .      .:\' ,|         .  ..\':.      |\n      /\'   / \'\"-..._  :   .:\'    _;:.,\'  \\.     .:\'   :. \'\'.    |\n     (._,.\'        \'`\'\'\'\'\'\'\'\'\'\'\'\'          \\.._.:      \':  \':   /\n________                                      \'`- ._    ,:__,,-\' ");
        } else if(catOdogOfish.equals("dog")){
            System.out.println("  ,_-~~~-,    _-~~-_\n /        ^-_/      \\_    _-~-.\n|      /\\  ,          `-_/     \\\n|   /~^\\ \'/  /~\\  /~\\   / \\_    \\\n \\_/    }/  /        \\  \\ ,_\\    }\n        Y  /  /~  /~  |  Y   \\   |\n       /   | {Q) {Q)  |  |    \\_/\n       |   \\  _===_  /   |\n       /  >--{     }--<  \\\n     /~       \\_._/       ~\\\n    /    *  *   Y    *      \\\n    |      * .: | :.*  *    |\n    \\    )--__==#==__--     /\n     \\_      \\  \\  \\      ,/\n       \'~_    | |  }   ,~\'\n          \\   {___/   /\n           \\   ~~~   /\n           /\\._._._./\\\n          {    ^^^    }\n           ~-_______-~\n            /       \\");
        } else if(catOdogOfish.equals("rabbit")){
            System.out.println("\\\\\n" + //
                                "      \\\\_\n" + //
                                "      ( _\\\n" + //
                                "      / \\__\n" + //
                                "     / _/`\"`\n" + //
                                "    {\\  )_\n" + //
                                "       `\"\"\"`"); 
        }else{
            System.out.println("                          A       ;\n                |   ,--,-/ \\---,-/|  ,\n               _|\\,\'. /|      /|   `/|-.\n           \\`.\'    /|      ,            `;.\n          ,\'\\   A     A         A   A _ /| `.;\n        ,/  _              A       _  / _   /|  ;\n       /\\  / \\   ,  ,           A  /    /     `/|\n      /_| | _ \\         ,     ,             ,/  \\\n     // | |/ `.\\  ,-      ,       ,   ,/ ,/      \\/\n     / @| |@  / /\'   \\  \\      ,              >  /|    ,--.\n    |\\_/   \\_/ /      |  |           ,  ,/        \\  ./\' __:..\n    |  __ __  |       |  | .--.  ,         >  >   |-\'   /     `\n  ,/| /  \'  \\ |       |  |     \\      ,           |    /\n /  |<--.__,->|       |  | .    `.        >  >    /   (\n/_,\' \\\\  ^  /  \\     /  /   `.    >--            /^\\   |\n      \\\\___/    \\   /  /      \\__\'     \\   \\   \\/   \\  |\n       `.   |/          ,  ,                  /`\\    \\  )\n         \\  \'  |/    ,       V    \\          /        `-\\\n          `|/  \'  V      V           \\    \\.\'            \\_\n           \'`-.       V       V        \\./\'\\\n               `|/-.      \\ /   \\ /,---`\\         kat\n                /   `._____V_____V\'\n                           \'     \'");
        }
    }
}