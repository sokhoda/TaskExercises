package builder;

public class BookWriter {
	private BookBuilder builder;

	public BookWriter(BookBuilder builder) {
		this.builder = builder;
	}

	public Book writeBook() {
		builder.buildTableOfContent();
		builder.buildPreface();
		builder.buildIntroduction();
		builder.buildChapters();
		builder.buildGlossary();
		return builder.getBook();
	}

	public BookBuilder getBuilder() {
		return builder;
	}

	public void setBuilder(BookBuilder builder) {
		this.builder = builder;
	}

}
