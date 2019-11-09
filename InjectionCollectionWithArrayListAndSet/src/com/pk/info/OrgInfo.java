package com.pk.info;
import java.util.List;
import java.util.Set;

public class OrgInfo {
        private String namesArray[] = new String[2];
        private List<String> empNameList;
        private Set<Integer> empIdsSet; 
        
        public String[] getNamesArray() {
			return namesArray;
		}
		public void setNamesArray(String[] namesArray) {
			this.namesArray = namesArray;
		}
		public List<String> getEmpNameList() {
			return empNameList;
		}
		public void setEmpNameList(List<String> empNameList) {
			this.empNameList = empNameList;
		}
		public Set<Integer> getEmpIdsSet() {
			return empIdsSet;
		}
		public void setEmpIdsSet(Set<Integer> empIdsSet) {
			this.empIdsSet = empIdsSet;
		}
}
