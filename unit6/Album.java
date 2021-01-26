public class Album {
  private Song[] songs;
  private String title;
  private String artistName;
  private int numSongs;
  private static int numAlbums;
  public static final int MAX_RUNTIME = 44; // in minutes


  public Album(String artist, String albumName) {
    title = albumName;
    artistName = artist;
    songs = new Song[MAX_RUNTIME];
    numAlbums++;
  }

  public int getRuntime() {
    int runtime;
    for(Song song: songs) {
      if(song != null)
        runtime += song.getSeconds();
    }
    return runtime;
  }

  public void addSong(Song song) {
    if(getRuntime()+song.getSeconds() < MAX_RUNTIME*60 && numSongs < songs.length) {
      songs[numSongs] = song;
      numSongs++;
    }
  }
}