package com.hpe.day7;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class DeviceSorter {
	static Comparator<Devices> sortAscDeviceName = 
			(o1, o2) -> o1.getdName().compareTo(o2.getdName());

	static Comparator<Devices> sortDescDeviceName = 
			(o1, o2) -> o2.getdName().compareTo(o1.getdName());
}

public class SetEx04 {
	public static void main(String[] args) {
		Set<Devices> set = new TreeSet<Devices>(DeviceSorter.sortDescDeviceName);

		set.add(new Devices(101, "Computer", 400));
		set.add(new Devices(123, "Laptop", 700));
		set.add(new Devices(234, "Mobile", 300));
		set.add(new Devices(222, "Mouse", 29));
		set.add(new Devices(222, "Mouse", 29));

		for (Devices temp : set) {
			System.out.println(temp + ", " + temp.hashCode());
		}
	}
}
