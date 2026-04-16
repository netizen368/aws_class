package kr.hi.server.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import lombok.AllArgsConstructor;
import lombok.Data;

@RestController
@RequestMapping("/api/v1/ai")
@CrossOrigin(origins = "[http://localhost:3000](http://localhost:3000/)")
@AllArgsConstructor
public class AIController {
	
	private final WebClient webClient;
	
	@GetMapping("/ask")
	public String ask(@RequestParam("prompt")String prompt) {
		String result = webClient.get()
		  .uri(uriBuilder-> uriBuilder
			  .path("/ask")
			  .queryParam("prompt", prompt)
	  		  .build())
	      .retrieve()
	      .bodyToMono(String.class)
	      .block();
	      return result;
	}
	
	@GetMapping("/translate")
	public String translate(
			@RequestParam("text")String text,
			@RequestParam("style")String style) {
		String result = webClient.get()
			  .uri(uriBuilder-> uriBuilder
				  .path("/translate")
				  .queryParam("text", text)
				  .queryParam("style", style)
		  		  .build())
		      .retrieve()
		      .bodyToMono(String.class)
		      .block();
		      return result;
	}
	
	@GetMapping("/ad-copy")
	public String adCopy(
			@RequestParam("product")String product,
			@RequestParam("feature")String feature,
			@RequestParam("target")String target,
			@RequestParam("temp")String temp,
			@RequestParam("count")String count
			) {
		String result = webClient.get()
			  .uri(uriBuilder-> uriBuilder
				  .path("/ad-copy")
				  .queryParam("product", product)
				  .queryParam("feature", feature)
				  .queryParam("target", target)
				  .queryParam("temp", temp)
				  .queryParam("count", count)
		  		  .build())
		      .retrieve()
		      .bodyToMono(String.class)
		      .block();
      return result;
	}
	
	@PostMapping("/summarize")
	public ResponseEntity<String> summarize(@RequestBody Summarize dto){
		String result = 
				webClient.post()
					.uri("/summarize")
					.bodyValue(dto)
					.retrieve()
					.bodyToMono(String.class)
					.block();
				
		return ResponseEntity.ok(result);
	}
}
@Data
class SummarizeDTO{
	private String text;
    private String target_lan;
    private int max_sentence;
}
record Summarize(
	    String text,
	    String target_lan,
	    int max_sentence
	) {}
