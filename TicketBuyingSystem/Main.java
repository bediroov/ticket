package TicketBuyingSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        Movie movie1 = new Movie("Breaking Bad", "Crime", 32);
        Movie movie2 = new Movie("Lucy", "adventure", 21);
        Movie movie3 = new Movie("Nobody", "science fiction", 13);
        Movie movie4 = new Movie("Joker", "Drama/Crime", 9);
        Movie movie5 = new Movie("ghosted", "horror", 13);

        // Create an array of movies
        Movie[] movies = { movie1, movie2, movie3, movie4, movie5 };

      //movcud filmleri istifadeciye goster
      while(true){
        System.out.print("If you want to exit please write exit!:");
        String exit = input.nextLine();
        if(exit=="exit"){
            break;
        }else{                                                                                                                                                  
        System.out.println("Available movies:\n");
        for (int i = 0; i < movies.length; i++) {
            System.out.println(
                    (i + 1) + ". " + movies[i].getTitle() + " (" + movies[i].getGenre() + ") - $" + String.format("%.2f", movies[i].getPrice()));
        }

      //isdifadeciden film secmeyi ve input elde etmeyi sorus 
        System.out.print("\nSelect a movie (1-" + movies.length + "): ");
        int movieIndex = input.nextInt() - 1;
        Movie selectedMovie = movies[movieIndex];
                          
        //  isdifadeciden nece yer secmeyi sorus  
        System.out.print("How many seats do you want to reserve? ");
        int numSeats = input.nextInt();
        int[] selectedSeats = new int[numSeats];
        for (int i = 0; i < numSeats; i++) {
            System.out.print("Select seat " + (i + 1) + " (1-100): ");
            selectedSeats[i] = input.nextInt();
        }

        // alici detallarini sorus
        System.out.print("Enter your name: ");
        String customerName = input.next();
        System.out.print("Enter your email: ");
        String customerEmail = input.next();

        // ticket obyektini yarat
        Ticket ticket = new Ticket("Ticket103", selectedMovie, selectedSeats, selectedMovie.getPrice() * numSeats, customerName, customerEmail);

        // isdifadeciye ticket detallarini goster
        System.out.println("\nTicket details:");
        ticket.displayTicketDetails();
        
       
    }
        // input.close();
}
    }
}
