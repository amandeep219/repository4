package student.library;

public class Library implements Comparable<Library> {
int libNum;
int totalBooks;
public Library(int libNum, int totalBooks) {
	
	this.libNum = libNum;
	this.totalBooks = totalBooks;
}
@Override
public int compareTo(Library l) {
	
	
	return this.libNum-l.libNum;
}
}
