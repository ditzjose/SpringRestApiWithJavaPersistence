package com.egen;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class MoveTable {

	String list_Actors;
	String list_Awards;
	String list_Country;
	String list_Director;
	String list_Genre;
	String list_Language;
	String list_Metascore;
	String list_Plot;
	String list_Poster;
	String list_Rated;
	String list_Released;
	String list_Runtime;
	@Id
	String list_Title;
	String list_Type;
	String list_Writer;
	String list_Year;
	String list_imdbID;
	String list_imdbRating;
	String list_imdbVotes;
	String list_UserOrderNum;
	public String getList_Actors() {
		return list_Actors;
	}
	public void setList_Actors(String list_Actors) {
		this.list_Actors = list_Actors;
	}
	public String getList_Awards() {
		return list_Awards;
	}
	public void setList_Awards(String list_Awards) {
		this.list_Awards = list_Awards;
	}
	public String getList_Country() {
		return list_Country;
	}
	public void setList_Country(String list_Country) {
		this.list_Country = list_Country;
	}
	public String getList_Director() {
		return list_Director;
	}
	public void setList_Director(String list_Director) {
		this.list_Director = list_Director;
	}
	public String getList_Genre() {
		return list_Genre;
	}
	public void setList_Genre(String list_Genre) {
		this.list_Genre = list_Genre;
	}
	public String getList_Language() {
		return list_Language;
	}
	public void setList_Language(String list_Language) {
		this.list_Language = list_Language;
	}
	public String getList_Metascore() {
		return list_Metascore;
	}
	public void setList_Metascore(String list_Metascore) {
		this.list_Metascore = list_Metascore;
	}
	public String getList_Plot() {
		return list_Plot;
	}
	public void setList_Plot(String list_Plot) {
		this.list_Plot = list_Plot;
	}
	public String getList_Poster() {
		return list_Poster;
	}
	public void setList_Poster(String list_Poster) {
		this.list_Poster = list_Poster;
	}
	public String getList_Rated() {
		return list_Rated;
	}
	public void setList_Rated(String list_Rated) {
		this.list_Rated = list_Rated;
	}
	public String getList_Released() {
		return list_Released;
	}
	public void setList_Released(String list_Released) {
		this.list_Released = list_Released;
	}
	public String getList_Runtime() {
		return list_Runtime;
	}
	public void setList_Runtime(String list_Runtime) {
		this.list_Runtime = list_Runtime;
	}
	public String getList_Title() {
		return list_Title;
	}
	public void setList_Title(String list_Title) {
		this.list_Title = list_Title;
	}
	public String getList_Type() {
		return list_Type;
	}
	public void setList_Type(String list_Type) {
		this.list_Type = list_Type;
	}
	public String getList_Writer() {
		return list_Writer;
	}
	public void setList_Writer(String list_Writer) {
		this.list_Writer = list_Writer;
	}
	public String getList_Year() {
		return list_Year;
	}
	public void setList_Year(String list_Year) {
		this.list_Year = list_Year;
	}
	public String getList_imdbID() {
		return list_imdbID;
	}
	public void setList_imdbID(String list_imdbID) {
		this.list_imdbID = list_imdbID;
	}
	public String getList_imdbRating() {
		return list_imdbRating;
	}
	public void setList_imdbRating(String list_imdbRating) {
		this.list_imdbRating = list_imdbRating;
	}
	public String getList_imdbVotes() {
		return list_imdbVotes;
	}
	public void setList_imdbVotes(String list_imdbVotes) {
		this.list_imdbVotes = list_imdbVotes;
	}
	public String getList_UserOrderNum() {
		return list_UserOrderNum;
	}
	public void setList_UserOrderNum(String list_UserOrderNum) {
		this.list_UserOrderNum = list_UserOrderNum;
	}

}
