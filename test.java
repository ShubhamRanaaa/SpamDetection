package main;

import java.io.IOException;

import detector.Detector;

public class Test {
	public static void main(String[] args) throws IOException {
		//System.out.println("Hello world");
		Detector detector = new Detector();
		//detector.train("SMSSpamCollection");
		
		detector.inputTrainData();
		
		
		
		detector.test("Want 2 get laid tonight? Want real Dogging locations sent direct 2 ur mob? Join the UK's largest Dogging Network bt Txting GRAVEL to 69888! Nt. ec2a. 31p.msg@150p");
		detector.test("You'll not rcv any more msgs from the chat svc. For FREE Hardcore services text GO to: 69988 If u get nothing u must Age Verify with yr network & try again");
		detector.test("GENT! We are trying to contact you. Last weekends draw shows that you won a £1000 prize GUARANTEED. Call 09064012160. Claim Code K52. Valid 12hrs only. 150ppm");
		detector.test("FreeMsg Why haven't you replied to my text? I'm Randy, sexy, female and live local. Luv to hear from u. Netcollex Ltd 08700621170150p per msg reply Stop to end");
		detector.test("Customer service annoncement. You have a New Years delivery waiting for you. Please call 07046744435 now to arrange delivery");
		
		System.out.println("------");
		detector.test("As I entered my cabin my PA said, '' Happy B'day Boss !!''. I felt special. She askd me 4 lunch. After lunch she invited me to her apartment. We went there");
		detector.test("Dear, will call Tmorrow.pls accomodate.");
	
	
	}
}
