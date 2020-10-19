package com.riviewz.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riviewz.dao.CameraDao;
import com.riviewz.dao.CarDao;
import com.riviewz.dao.CatDao;
import com.riviewz.dao.DogDao;
import com.riviewz.dao.FitnessCenterDao;
import com.riviewz.dao.FragranceDao;
import com.riviewz.dao.MotorCycleDao;
import com.riviewz.dao.MovieDao;
import com.riviewz.dao.NightLifeDao;
import com.riviewz.dao.OnlineStoreDao;
import com.riviewz.dao.PackersAndMoversDao;
import com.riviewz.dao.RestaurantDao;
import com.riviewz.dao.SalonDao;
import com.riviewz.dao.ScooterDao;
import com.riviewz.dao.SpaCenterDao;
import com.riviewz.dao.TattooParlorDao;
import com.riviewz.model.BaseModel;
import com.riviewz.model.Camera;
import com.riviewz.model.Car;
import com.riviewz.model.Dog;
import com.riviewz.model.FitnessCenter;
import com.riviewz.model.Fragrance;
import com.riviewz.model.MotorCycle;
import com.riviewz.model.Movie;
import com.riviewz.model.NightLife;
import com.riviewz.model.OnlineStore;
import com.riviewz.model.Salon;
import com.riviewz.model.Scooter;
import com.riviewz.model.SpaCenter;
import com.riviewz.model.TattooParlor;

@Service
@Transactional
public class EntityService {
	
	@Autowired
	CameraDao cameraDao;
	@Autowired
	CarDao carDao;
	@Autowired
	CatDao catDao;
	@Autowired
	DogDao dogDao;
	@Autowired
	FitnessCenterDao fitnessCenterDao;
	@Autowired
	FragranceDao fragranceDao;
	@Autowired
	MotorCycleDao motorCycleDao;
	@Autowired
	MovieDao movieDao;
	@Autowired
	NightLifeDao nightLifeDao;
	@Autowired
	OnlineStoreDao onlineStoreDao;
	@Autowired
	PackersAndMoversDao packersAndMoversDao;	
	@Autowired
	RestaurantDao restaurantDao;
	@Autowired
	SalonDao salonDao;
	@Autowired
	ScooterDao scooterDao;
	@Autowired
	SpaCenterDao spaCenterDao;
	@Autowired
	TattooParlorDao tattooParlorDao;
	
	public List<BaseModel> getEntityDetails(String category, String subCategory ) {
		
		if(category.equalsIgnoreCase("camera")) {
			return cameraDao.findCameraByBrand(subCategory);
		}
		
		else if(category.equalsIgnoreCase("car")) {
			return carDao.findAllCarByMfgName(subCategory);
		}
		
		else if(category.equalsIgnoreCase("dog")) {
			return dogDao.findAllDogByCategory(subCategory);
		}		
		
		else if(category.equalsIgnoreCase("fitness_center")) {
			return fitnessCenterDao.findAllFitnessCenterByCityName(subCategory);
		}		
		
		else if(category.equalsIgnoreCase("fragrance")) {
			return fragranceDao.findAllFragranceByBrand(subCategory);
		}
		
		else if(category.equalsIgnoreCase("motor_cycle")) {
			return motorCycleDao.findAllMotorCycleByMfgName(subCategory);
		}		
		
		else if(category.equalsIgnoreCase("movie")) {
			List<BaseModel> bm = new ArrayList<BaseModel>();
			if(subCategory.equalsIgnoreCase("Other Languages")) {
				List<Movie> m = movieDao.findAllMovieByOtherLanguage(); 
				bm.addAll(m);
			}
			List<Movie> m = movieDao.findAllMovieByLanguage(subCategory); 
			bm.addAll(m);
			
			return bm;
		}
		
		else if(category.equalsIgnoreCase("night_life")) {
			return nightLifeDao.findAllNightLifeByCityName(subCategory);
		}		
		
		else if(category.equalsIgnoreCase("restaurant")) {
			return restaurantDao.findAllRestaurantByCityName(subCategory);
		}
		
		else if(category.equalsIgnoreCase("salon")) {
			return salonDao.findAllSalonByCityName(subCategory);
		}		
		
		else if(category.equalsIgnoreCase("scooter")) {
			return scooterDao.findAllScooterByMfgName(subCategory);
		}
		
		else if(category.equalsIgnoreCase("spa_center")) {
			return spaCenterDao.findAllSpaCenterByCityName(subCategory);
		}		
		
		else if(category.equalsIgnoreCase("tattoo_parlor")) {
			return tattooParlorDao.findAllTattooParlorByCityName(subCategory);
		}
		
		return null;

	}
	
	public void updateCounter(String category, int entityFk) {
		
		if(category.equalsIgnoreCase("camera")) {
			Camera camera = cameraDao.findCounterById(entityFk);
			int counter = camera.getCounter() + 1;
			cameraDao.updateCounter(counter, entityFk);
		}
		
		else if(category.equalsIgnoreCase("car")) {
			Car car = carDao.findCounterById(entityFk);
			int counter = car.getCounter() + 1;
			carDao.updateCounter(counter, entityFk);
		}
		
		else if(category.equalsIgnoreCase("dog")) {
			Dog dog = dogDao.findCounterById(entityFk);
			int counter = dog.getCounter() + 1;
			dogDao.updateCounter(counter, entityFk);
		}		
		
		else if(category.equalsIgnoreCase("fitness_center")) {
			FitnessCenter fitnessCenter = fitnessCenterDao.findCounterById(entityFk);
			int counter = fitnessCenter.getCounter() + 1;
			fitnessCenterDao.updateCounter(counter, entityFk);
		}		
		
		else if(category.equalsIgnoreCase("fragrance")) {
			Fragrance fragrance = fragranceDao.findCounterById(entityFk);
			int counter = fragrance.getCounter() + 1;
			fragranceDao.updateCounter(counter, entityFk);
		}
		
		else if(category.equalsIgnoreCase("motor_cycle")) {
			MotorCycle motorCycle = motorCycleDao.findCounterById(entityFk);
			int counter = motorCycle.getCounter() + 1;
			motorCycleDao.updateCounter(counter, entityFk);
		}		
		
		else if(category.equalsIgnoreCase("movie")) {
			Movie movie = movieDao.findCounterById(entityFk);
			int counter = movie.getCounter() + 1;
			movieDao.updateCounter(counter, entityFk);
		}
		
		else if(category.equalsIgnoreCase("night_life")) {
			NightLife nightLife = nightLifeDao.findCounterById(entityFk);
			int counter = nightLife.getCounter() + 1;
			nightLifeDao.updateCounter(counter, entityFk);
		}		
		
		else if(category.equalsIgnoreCase("restaurant")) {
			OnlineStore onlineStore = restaurantDao.findCounterById(entityFk);
			int counter = onlineStore.getCounter() + 1;
			restaurantDao.updateCounter(counter, entityFk);
		}
		
		else if(category.equalsIgnoreCase("salon")) {
			Salon salon = salonDao.findCounterById(entityFk);
			int counter = salon.getCounter() + 1;
			salonDao.updateCounter(counter, entityFk);
		}		
		
		else if(category.equalsIgnoreCase("scooter")) {
			Scooter scooter = scooterDao.findCounterById(entityFk);
			int counter = scooter.getCounter() + 1;
			scooterDao.updateCounter(counter, entityFk);
		}
		
		else if(category.equalsIgnoreCase("spa_center")) {
			SpaCenter spaCenter = spaCenterDao.findCounterById(entityFk);
			int counter = spaCenter.getCounter() + 1;
			spaCenterDao.updateCounter(counter, entityFk);
		}		
		
		else if(category.equalsIgnoreCase("tattoo_parlor")) {
			TattooParlor tattooParlor = tattooParlorDao.findCounterById(entityFk);
			int counter = tattooParlor.getCounter() + 1;
			tattooParlorDao.updateCounter(counter, entityFk);
		}
	}
	
	public void decrementCounter(String category, int entityFk) {
		
		if(category.equalsIgnoreCase("camera")) {
			Camera camera = cameraDao.findCounterById(entityFk);
			int counter = camera.getCounter() - 1;
			cameraDao.updateCounter(counter, entityFk);
		}
		
		else if(category.equalsIgnoreCase("car")) {
			Car car = carDao.findCounterById(entityFk);
			int counter = car.getCounter() - 1;
			carDao.updateCounter(counter, entityFk);
		}
		
		else if(category.equalsIgnoreCase("dog")) {
			Dog dog = dogDao.findCounterById(entityFk);
			int counter = dog.getCounter() - 1;
			dogDao.updateCounter(counter, entityFk);
		}		
		
		else if(category.equalsIgnoreCase("fitness_center")) {
			FitnessCenter fitnessCenter = fitnessCenterDao.findCounterById(entityFk);
			int counter = fitnessCenter.getCounter() - 1;
			fitnessCenterDao.updateCounter(counter, entityFk);
		}		
		
		else if(category.equalsIgnoreCase("fragrance")) {
			Fragrance fragrance = fragranceDao.findCounterById(entityFk);
			int counter = fragrance.getCounter() - 1;
			fragranceDao.updateCounter(counter, entityFk);
		}
		
		else if(category.equalsIgnoreCase("motor_cycle")) {
			MotorCycle motorCycle = motorCycleDao.findCounterById(entityFk);
			int counter = motorCycle.getCounter() - 1;
			motorCycleDao.updateCounter(counter, entityFk);
		}		
		
		else if(category.equalsIgnoreCase("movie")) {
			Movie movie = movieDao.findCounterById(entityFk);
			int counter = movie.getCounter() - 1;
			movieDao.updateCounter(counter, entityFk);
		}
		
		else if(category.equalsIgnoreCase("night_life")) {
			NightLife nightLife = nightLifeDao.findCounterById(entityFk);
			int counter = nightLife.getCounter() - 1;
			nightLifeDao.updateCounter(counter, entityFk);
		}		
		
		else if(category.equalsIgnoreCase("restaurant")) {
			OnlineStore onlineStore = restaurantDao.findCounterById(entityFk);
			int counter = onlineStore.getCounter() - 1;
			restaurantDao.updateCounter(counter, entityFk);
		}
		
		else if(category.equalsIgnoreCase("salon")) {
			Salon salon = salonDao.findCounterById(entityFk);
			int counter = salon.getCounter() - 1;
			salonDao.updateCounter(counter, entityFk);
		}		
		
		else if(category.equalsIgnoreCase("scooter")) {
			Scooter scooter = scooterDao.findCounterById(entityFk);
			int counter = scooter.getCounter() - 1;
			scooterDao.updateCounter(counter, entityFk);
		}
		
		else if(category.equalsIgnoreCase("spa_center")) {
			SpaCenter spaCenter = spaCenterDao.findCounterById(entityFk);
			int counter = spaCenter.getCounter() - 1;
			spaCenterDao.updateCounter(counter, entityFk);
		}		
		
		else if(category.equalsIgnoreCase("tattoo_parlor")) {
			TattooParlor tattooParlor = tattooParlorDao.findCounterById(entityFk);
			int counter = tattooParlor.getCounter() - 1;
			tattooParlorDao.updateCounter(counter, entityFk);
		}
	}	
	
}