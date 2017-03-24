package creational.builder;

import lombok.Data;

@Data
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
}
