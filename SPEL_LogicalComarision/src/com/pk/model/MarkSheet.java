package com.pk.model;
public class MarkSheet {
        private String studentName;
        private Integer marksInMaths;
		private Integer marksInPhysics;
        private Integer marksInChemistry;
        
        public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public Integer getMarksInMaths() {
			return marksInMaths;
		}
		public void setMarksInMaths(Integer marksInMaths) {
			this.marksInMaths = marksInMaths;
		}
		public Integer getMarksInPhysics() {
			return marksInPhysics;
		}
		public void setMarksInPhysics(Integer marksInPhysics) {
			this.marksInPhysics = marksInPhysics;
		}
		public Integer getMarksInChemistry() {
			return marksInChemistry;
		}
		public void setMarksInChemistry(Integer marksInChemistry) {
			this.marksInChemistry = marksInChemistry;
		}
}
