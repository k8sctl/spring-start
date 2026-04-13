package hello.hello_spring;

import hello.hello_spring.aop.TimeTraceAop;
import hello.hello_spring.repository.*;
import hello.hello_spring.service.MemberService;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import javax.swing.*;
import javax.xml.crypto.Data;

@Configuration
public class SpringConfig {

    // private DataSource dataSource;
    // vate EntityManager em;

    /*
        @Autowired
        public SpringConfig(DataSource dataSource, EntityManager em) {
            this.dataSource = dataSource;
            this.em = em;
        }
    */

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

    /*
        @Bean
        public TimeTraceAop timeTraceAop() {
            return new TimeTraceAop();
        }
    */

    /*
        @Bean
        public MemberRepository memberRepository() {
            // return new MemberRepository();
            // return new JdbcMemberRepository(dataSource);
            // return new JdbcTemplateMemberRepository(dataSource);
            // return new JpaMemberRepository(em);
        }
    */
}
