package com.mysite.sbb;




import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;


    @Test
    void testJpa() {
    	Question q = this.questionRepository.findBySubject("sbb가 무엇인가요?");
    	assertEquals(2,q.getId());                                              
    }
}
