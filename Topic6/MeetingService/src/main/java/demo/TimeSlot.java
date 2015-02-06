/**
 * 
 */
package demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author RoDoX
 *
 */
@Entity
@Table(name="time_slot")
	public class TimeSlot{

		// ==============
	  	// PRIVATE FIELDS
	  	// ==============

	  	// An autogenerated id (unique for each time slot in the db)
	  	@Id
	  	@GeneratedValue(strategy = GenerationType.AUTO)
	  	private long id;

	  	//
	  	
		@NotNull
	  	private String start;
		@NotNull
	  	private String end;
		
		
	/*	@OneToMany
		@JoinColumn(name="id", referencedColumnName="id")
		private Set<Meeting> meetingCollection;
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "timeSlot")
	    */
	  	

	  	// ==============
	  	// PUBLIC METHODS
	  	// ==============
	  	public TimeSlot(){
	  			
	  	}
	  	
	  	public TimeSlot(String start, String end) { 
	  		this.start = start;
	  		this.end = end;
	  	}

	  	
	  	
	 /* 	public Collection<Meeting> getMeetingCollection() {
			return meetingCollection;
		}

		public void setMeetingCollection(Set<Meeting> meetingCollection) {
			this.meetingCollection = meetingCollection;
		}*/

		public TimeSlot(long id) {
	  		this.id = id;
	  	}

		public long getId(){
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getStart() {
			return start;
		}

		public void setStart(String start) {
			this.start = start;
		}

		public String getEnd() {
			return end;
		}

		public void setEnd(String end) {
			this.end = end;
		}
		
		
		
	}
