/**
 * 
 */
package demo;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author RoDoX
 *
 */
@Entity
@Table(name="meeting")
	public class Meeting {

		// ==============
	  	// PRIVATE FIELDS
	  	// ==============

	  	// An autogenerated id (unique for each user in the db)
	  	@Id
	  	@GeneratedValue(strategy = GenerationType.AUTO)
	  	private long id;

	  	
	     @Column(name = "description")
	     private String description;
	     
	     @ManyToMany(mappedBy = "meetingCollection")
	     private Collection<Attendee> attendeeCollection;
	     @JoinColumn(name = "id_room", referencedColumnName = "id")
	     @ManyToOne(optional = false)
	     private Room room;
	     @JoinColumn(name = "id_time_slot", referencedColumnName = "id")
	     @ManyToOne(optional = false)
	     private TimeSlot timeSlot;
		
	    public Meeting(){
	    	
	    }
	     
		public Meeting(long id) {
			this.id=id;
		}
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
	
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Collection<Attendee> getAttendeeCollection() {
			return attendeeCollection;
		}
		public void setAttendeeCollection(Collection<Attendee> attendeeCollection) {
			this.attendeeCollection = attendeeCollection;
		}
		public Room getRoom() {
			return room;
		}
		
		public Long getIdRoom(){
			return room.getId();
		}
		public void setRoom(Room room) {
			this.room = room;
		}
		public TimeSlot getTimeSlot() {
			return timeSlot;
		}
		public void setTimeSlot(TimeSlot timeSlot) {
			this.timeSlot = timeSlot;
		}

	     
	     
	     
}
