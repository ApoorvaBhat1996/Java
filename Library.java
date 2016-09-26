package practise12;

public class Library {
	int visitor_timing;
	int bl_time;
	int dl_time;
	String questionPapers;
	
	Library(int visitor_timing, int bl_time, int dl_time, String questionPapers ){
		this.visitor_timing=visitor_timing;
		this.bl_time=bl_time;
		this.dl_time=dl_time;
		this.questionPapers=questionPapers;
		
		
		
	}
	
	



void reference_section(){
	if(visitor_timing>4){
		System.out.println("Visitor not allowed");
		
	}
	else
		System.out.println("visitor is allowed");
	
}

void books_lending_section(){
	float penalty;
	if(bl_time>15 && bl_time<=22){
		penalty=20*bl_time;
		System.out.println("Penalty for exceeding time limit is:"+penalty);
	}
		else if(bl_time>=23 && bl_time<=30){
			penalty=50*bl_time;
			System.out.println("Penalty for exceeding time limit is:"+penalty);
			
	}
		else if(bl_time>=31 && bl_time<=38){
			penalty=150*bl_time;
			System.out.println("Penalty for exceeding time limit is: "+penalty);
		}
		else if( bl_time>38){
			penalty=300*bl_time;
			System.out.println("Penalty for exceeding time limit is:"+penalty);
			
		}
		else
			System.out.println("no penalty issued");
			
	
				
		}
		
	
	


void digital_library_section(){
	if(dl_time>2){
		System.out.println("Library closed");
	}
		else
			System.out.println("Libraray opened");
	}
	


void questionpaper_maintainance_section(){
	String department_wise;
	String Year_wise;
	if(questionPapers=="department_wise"){
		System.out.println("Gets Set1");
	}
	else
		System.out.println("Gets Set2");
}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	

