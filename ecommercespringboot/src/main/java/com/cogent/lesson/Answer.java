package com.cogent.lesson;
//one to many code

public class Answer {
	
	@Entity  
	@Table(name="answers")  
	public class Answer {   
	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)  
	  
	private int id;    
	private String answername;    
	private String postedBy;
	@ManyToOne
	private Question ques;
	public int getId() {  
	    return id;  
	}  
	public void setId(int id) {  
	    this.id = id;  
	}  
	public String getAnswername() {  
	    return answername;  
	}  
	public void setAnswername(String answername) {  
	    this.answername = answername;  
	}  
	public String getPostedBy() {  
	    return postedBy;  
	}  
	public void setPostedBy(String postedBy) {  
	    this.postedBy = postedBy;  
	}

	public Question getQues() {
		return ques;
	}
	public void setQues(Question ques) {
		this.ques = ques;
	}      
	}    


	Answer ans1=new Answer();    
	    ans1.setAnswername("Java is a programming language");    
	    ans1.setPostedBy("Ravi Malik");    
	        
	    Answer ans2=new Answer();    
	    ans2.setAnswername("Java is a platform independents");    
	    ans2.setPostedBy("Sudhir Kumar");    
	        
	    Answer ans3=new Answer();    
	    ans3.setAnswername("Servlet is an Interface");    
	    ans3.setPostedBy("Jai Kumar");  
	    
	    
	    Answer ans5=new Answer();    
	    ans5.setAnswername("Servlet is an Interface and new interface");    
	    ans5.setPostedBy("Jai Kumar");  
	        
	    Answer ans4=new Answer();    
	    ans4.setAnswername("Servlet is an API");    
	    ans4.setPostedBy("Arun");    
	        
	    ArrayList<Answer> list1=new ArrayList<Answer>();    
	    list1.add(ans1);    
	    list1.add(ans2);    
	        
	    ArrayList<Answer> list2=new ArrayList<Answer>();    
	    list2.add(ans3);    
	    list2.add(ans4);    
	        //Questions-What is java
	    //Question-what is servlets
	    
	    Question question1=new Question();    
	    question1.setQname("What is Java?");    
	    question1.setAnswers(list1);    
	        
	    Question question2=new Question();    
	    question2.setQname("What is Servlet?");    
	    question2.setAnswers(list2);    
	        
	    session.save(question1);    
	    session.save(question2);   
	    session.save(ans5);
	       
	
	
	
	

}
