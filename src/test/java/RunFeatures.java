import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//JUnit의 실행 클래스 지정하는 Anotation
@RunWith(Cucumber.class)
// Cucumber의 커맨드에 대한 파라미터 옵션, feature : feature 폴더 패스, format :  실행 결과 표시 포맷 
@CucumberOptions(features = "src/test/java/features/",
format = {"pretty", "html:target/cucumber", "json:target/cucumber-report.json"})
public class RunFeatures {

}
