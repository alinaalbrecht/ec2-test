package devops_practice_2.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import devops_practice_2.logic.WordService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class WordController {
    private final WordService wordService;

    @GetMapping("/reverse/{word}")
    public String reverse(@PathVariable String word) {
        var reversed = wordService.reverse(word);
        LOG.info("%s is %s reversed".formatted(word, reversed));
        return reversed;
    }
}
