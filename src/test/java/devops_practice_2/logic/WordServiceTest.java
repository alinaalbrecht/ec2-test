package devops_practice_2.logic;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@RequiredArgsConstructor
public class WordServiceTest {
    private WordService wordService;

    @BeforeEach
    void setUp() {
        wordService = new WordService();
    }

    @Test
    public void shouldReverseWord() {
        var result = wordService.reverse("hello");
        assert(result).equals("olleh");
    }
}
