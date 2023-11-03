package model;

public class Phim141 {
    public int FilmID;
    public String FilmVersion;
    public int Time;
    public String FilmName;
    public String Description;
    
    public Phim141() {
    	// Constructor mặc định
    }

	public Phim141(int FilmID, String FilmVersion, int Time, String FilmName, String Description) {
		this.FilmID = FilmID;
		this.FilmVersion = FilmVersion;
		this.Time = Time;
		this.FilmName = FilmName;
		this.Description = Description;
	}

	public int getFilmID() {
		return FilmID;
	}

	public void setFilmID(int filmID) {
		FilmID = filmID;
	}

	public String getFilmVersion() {
		return FilmVersion;
	}

	public void setFilmVersion(String filmVersion) {
		FilmVersion = filmVersion;
	}

	public int getTime() {
		return Time;
	}

	public void setTime(int time) {
		Time = time;
	}

	public String getFilmName() {
		return FilmName;
	}

	public void setFilmName(String filmName) {
		FilmName = filmName;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	@Override
	public String toString() {
		return "Phim141 [FilmID=" + FilmID + ", FilmVersion=" + FilmVersion + ", Time=" + Time + ", FilmName="
				+ FilmName + ", Description=" + Description + "]";
	}
	
	
    
    
}

