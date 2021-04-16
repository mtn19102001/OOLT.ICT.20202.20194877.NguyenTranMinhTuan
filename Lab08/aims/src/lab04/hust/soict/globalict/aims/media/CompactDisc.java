package lab04.hust.soict.globalict.aims.media;

import java.time.LocalDate;
import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable, Comparable<Object>{
	private ArrayList<Track> tracks = new ArrayList<Track>();
	private String artist;
	public String getArtist() {
		return artist;
	}
	public CompactDisc(int id) {
		super(id);
		this.dateAdded = LocalDate.now();
	}
	public CompactDisc(String title, String category, String director,int length, float cost) {
		super(title, category, director,length, cost);
		this.id = nb;
		this.dateAdded = LocalDate.now();
	}
	public CompactDisc(String title, String category, String director, String artist, int length, float cost) {
		super(title, category, director, length, cost);
		this.artist = artist;
		this.id = nb;
		this.dateAdded = LocalDate.now();
	}
	public int getCDlength() {
		int CDlength = 0;
		for(int i = 0; i < tracks.size(); i++) {
			CDlength += tracks.get(i).getLength();
		}
		return CDlength;
	}
	public void play() {
		for(int i = 0; i < tracks.size(); i++) {
			tracks.get(i).play();
		}
		System.out.println("The CD has " + tracks.size() + " track(s)" + " with a total of " + getCDlength() + " minute(s)");
	}
	
	//Aggregration part
	public class Track implements Playable, Comparable{
		private String title;
		private int length;
		public String getTitle() {
			return title;
		}
		public int getLength() {
			return length;
		}
		public Track(String title, int length) {
			super();
			this.title = title;
			this.length = length;
		}
		public boolean addTrack(Track inputTrack) {
			if(tracks.contains(inputTrack) == true) {
				System.out.println(inputTrack + "is already in the track list");
				return true;
			}else {
				tracks.add(inputTrack);
				return false;
			}
		}
		public boolean removeTrack(Track inputTrack) {
			if(tracks.contains(inputTrack) == false) {
				System.out.println(inputTrack + "is not in the track list");
				return false;
			}else {
				tracks.remove(inputTrack);
				return true;
			}
		}
		public void play() {
			System.out.println("PLaying DVD: " + this.getTitle());
			System.out.println("DVD length: " + this.getLength());
		}
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Track) {
				Track track = (Track) obj;
				if(this.title == track.title && this.length == track.length) {
					return true;
				}else {
					return false;
				}
			}else 
				return false;
		}
		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			return 0;
		}
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
