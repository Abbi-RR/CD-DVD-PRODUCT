public class CD extends Product{
   String artist;
   String Label;
   int numSong;

   
   public CD(){
       super();
       artist = "";
       Label = "";
       numSong = 0;
   }
   public CD(int number, String name, int quantity, double price, String artist, int numSong, String label){
    super(number, name, quantity, price);
    this.artist = artist;
    this.numSong = numSong;
    this.Label = label;
   }

}