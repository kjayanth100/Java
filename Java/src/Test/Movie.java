package Test;

public class Movie {
		String title;
		int likes;
		public int like() {
			likes=likes+1;
			return likes;
		}
		public void displayLikes() {
			System.out.println("Movie Title: " +title);
			System.out.println("Likes: "+like());
		}
		public static void main(String[] args) {
			Movie obj=new Movie();
			obj.title="ARYA";
obj.like();
			obj.displayLikes();
		}

	}

