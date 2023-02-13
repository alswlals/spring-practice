package com.douzone.container.videosystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations= {"classpath:com/douzone/container/config/videosystem/applicationContext.xml"})
public class DVDPlayerXmlConfigTest {

	/* @Autowired
	 * 예외 발생 
	 * XML Bean Configuration(Avengers)에서는 자동으로 id를 부여하지 않는다.
	 * @Qualifier를 사용할 수 없다. */
	DigitalVideoDisc dvd1;
	
	@Test
	@Disabled
	public void testDVD1() {
		assertNotNull(dvd1);
	}
	
	@Autowired
	@Qualifier("ironMan")
	DigitalVideoDisc dvd2;
	
	@Test
	public void testDVD2() {
		assertNotNull(dvd2);
	}
	
	@Autowired
	@Qualifier("avengerInfinityWar")
	DigitalVideoDisc dvd3;
	
	@Test
	public void testDVD3() {
		assertNotNull(dvd3);
	}
	
	@Autowired
	@Qualifier("avengersEndgame")
	DigitalVideoDisc dvd4;
	
	@Test
	public void testDVD4() {
		assertNotNull(dvd4);
	}
	
	@Autowired
	@Qualifier("avengersAgeOfUltron")
	DigitalVideoDisc dvd5;
	
	@Test
	public void testDVD5() {
		assertNotNull(dvd5);
	}
	

	@Autowired
	@Qualifier("avengersCaptainAmerica")
	DigitalVideoDisc dvd6;
	
	@Test
	public void testDVD6() {
		assertNotNull(dvd6);
	}
	

	@Autowired
	@Qualifier("avengersDirectorEdition")
	DigitalVideoDisc dvd7;
	
	@Test
	public void testDVD7() {
		assertNotNull(dvd7);
	}
	
	@Autowired
	@Qualifier("avengersTriplePack")
	DVDPack dvdPack;
	
	@Test
	public void testDVDPack() {
		assertNotNull(dvdPack);
	}
	
	@Autowired
	@Qualifier("avengerExpansionEdition1")
	DigitalVideoDisc dvd9;
	
	@Test
	public void testDVD9() {
		assertNotNull(dvd9);
	}
	
	@Autowired
	@Qualifier("avengerExpansionEdition2")
	DigitalVideoDisc dvd10;
	
	@Test
	public void testDVD10() {
		assertNotNull(dvd10);
	}
	
	@Autowired
	@Qualifier("avengerExpansionEdition3")
	DigitalVideoDisc dvd11;
	
	@Test
	public void testDVD11() {
		assertNotNull(dvd11);
	}
	
	@Autowired
	@Qualifier("dvdPlayer1")
	DVDPlayer dvdPlayer1;
	
	@Test
	public void testPlayer1() {
		assertEquals("Playing Movie MARVEL's Iron Man", dvdPlayer1.play());
	}
	
	@Autowired
	@Qualifier("dvdPlayer2")
	DVDPlayer dvdPlayer2;
	
	@Test
	public void testPlayer2() {
		assertEquals("Playing Movie MARVEL's Iron Man", dvdPlayer2.play());
	}

	
	@Autowired
	@Qualifier("dvdPlayer3")
	DVDPlayer dvdPlayer3;
	
	@Test
	public void testPlayer3() {
		assertEquals("Playing Movie MARVEL's Iron Man", dvdPlayer3.play());
	}
	
	@Autowired
	@Qualifier("dvdPlayer4")
	DVDPlayer dvdPlayer4;
	
	@Test
	public void testPlaye42() {
		assertEquals("Playing Movie MARVEL's Iron Man", dvdPlayer4.play());
	}
	
	@Autowired
	@Qualifier("dvdPlayer5")
	DVDPlayer dvdPlayer5;
	
	@Test
	public void testPlayer5() {
		assertEquals("Playing Movie MARVEL's Iron Man", dvdPlayer5.play());
	}

}
