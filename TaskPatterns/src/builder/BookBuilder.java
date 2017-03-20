package builder;

public interface BookBuilder {
	void buildTableOfContent();

	void buildPreface();

	void buildIntroduction();

	void buildChapters();

	void buildGlossary();

	Book getBook();

}
