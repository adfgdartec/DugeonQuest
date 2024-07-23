import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //Declare 2-D Array
        String[][] locations;

        //Initialize the 2-D array
        locations = new String[6][4];

        //Assign values to the 2-D Array
        locations[0][0] = "You are at the entrance to the cave.";
        locations[0][1] = "You are in a narrow corridor that curves to the south.";
        locations[0][2] = "You are in a big room.";
        locations[1][0] = "You are in a small room.";
        locations[1][1] = "You are in a medium sized room.";
        locations[1][2] = "You are in a extremely well maintained room.";
        locations[2][0] = "You are in a narrow and spiky room.";
        locations[2][1] = "You are in a big dead end and have no where to go.";
        locations[2][2] = "You are in a  corridor that curves to the south.";
        locations[3][0] = "You are in a big corridor that curves to the north.";
        locations[3][1] = "You are in a narrow corridor that curves to the east.";
        locations[3][2] = "You are in a narrow corridor that curves to the west.";

        //Variables to track players position
        int row = 0 ,col = 0;

        //Scanner Input
        Scanner userInput = new Scanner(System.in);


        //While loop to control where and how long the player travels around the dungeon
        while(true){
            System.out.println(locations[row][col]);
            System.out.println("1. GO North");
            System.out.println("2. GO West");
            System.out.println("3. GO East");
            System.out.println("4. GO South");

            //Track the response of user
            int response = userInput.nextInt();

            if(response == 1){
                row--;
            }
            else if(response == 2){
                col++;
            }
            else if(response == 3){
                row++;
            }
            else if(response == 4){
                col--;
            }

            //Define Array Bounds
            if(row < 0) row = 0;
            if(col < 0) col = 0;
            if(row > 3) row = 3;
            if(col > 2) col = 2;

        }




    }
}
