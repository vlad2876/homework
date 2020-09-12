package by.belhard.j24.homeworks.hw05;

public class Book {
     String title;
     int pages;
     Format format;
     Author author;

    public Book(String title, int pages, Format format, Author author) {
        this.title = title;
        this.pages = pages;
        this.format = format;
        this.author = author;

        if(this.pages < 2){
            setPages(3);
        }
        if(author.name == null || author.name.equals(" ")){
            author.setName("Unknown");
        }
        if(author.surname == null || author.surname.equals(" ")){
            author.setSurname("Unknown");
        }
        if(author.age < 2){
            author.setAge(3);
        }
        if(this.title == null || title.equals(" ")){
            setTitle("Unknown");
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", format=" + format +
                ", author=" + author.getName() + " " + author.getSurname() + ", " + author.getAge() +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public Format getFormat() {
        return format;
    }

    public String getAuthor() {
        return author.getName() + " " + author.getSurname() + ", " + author.getAge();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
