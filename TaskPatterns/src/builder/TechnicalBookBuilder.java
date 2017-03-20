package builder;

public class TechnicalBookBuilder implements BookBuilder {
	Book book;

	public TechnicalBookBuilder() {
		this.book = new Book();
	}

	public TechnicalBookBuilder(Book book) {
		this.book = book;
	}

	@Override
	public void buildTableOfContent() {
		System.out.println("TechnicalBookBuilder: buildTableOfContent");
		book.setTableOfContent("tech: TableOfContents");
	}

	@Override
	public void buildPreface() {
		System.out.println("TechnicalBookBuilder: buildPreface");
		book.setPreface("tech: Preface");
	}

	@Override
	public void buildIntroduction() {
		System.out.println("TechnicalBookBuilder: buildIntroduction");
		book.setIntroduction("tech: Introduction");

	}

	@Override
	public void buildChapters() {
		System.out.println("TechnicalBookBuilder: buildChapters");
		book.setChapters("tech: Chapter");
	}

	@Override
	public void buildGlossary() {
		System.out.println("TechnicalBookBuilder: buildGlossary");
		book.setChapters("tech: Glossary");
	}

	@Override
	public Book getBook() {
		return book;
	}

}
