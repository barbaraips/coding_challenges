import static spark.Spark.get;
import static spark.Spark.path;

public class VetorPalavras {

	public static void main(String[] args) {

		//http://localhost:4567/get_response/2
		//http://sparkjava.com/documentation#getting-started

		path("/", () -> {
			path("/send_text", () -> {
				get("/add", (request, response) -> "HIIIIIIIIIIIIIIIIII");
			});
			path("/get_response", () -> {
				get("/1", (request, response) -> Vocabulary.getIsolatedVocabulary());
				get("/2", (request, response) -> Vocabulary.getNGramVocabulary());
				get("/3", (request, response) -> Vocabulary.getIsolatedVector());
				get("/4", (request, response) -> Vocabulary.getNGramVector());
			});
		});
	}
}
