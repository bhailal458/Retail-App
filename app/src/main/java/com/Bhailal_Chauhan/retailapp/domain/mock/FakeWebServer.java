package com.Bhailal_Chauhan.retailapp.domain.mock;

import android.app.Activity;
import android.content.Context;

import com.Bhailal_Chauhan.retailapp.model.GlobaDataHolder;
import com.Bhailal_Chauhan.retailapp.model.entities.Product;
import com.Bhailal_Chauhan.retailapp.model.entities.ProductCategoryModel;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/*
 * This class serve as fake server and provides dummy product and category with real Image Urls taken from flipkart
 */
public class FakeWebServer {

	private static FakeWebServer fakeServer;


	Context context;
	Activity mm= (Activity)context;

	void initiateFakeServer() {

		addCategory();

	}

	public void addCategory() {

		ArrayList<ProductCategoryModel> listOfCategory = new ArrayList<ProductCategoryModel>();

		listOfCategory
				.add(new ProductCategoryModel(
						"Vegetables",
						" ",
						"10%",
						"https://thumb.ibb.co/c3syov/veg.png"
				));

		listOfCategory
				.add(new ProductCategoryModel(
						"Fruits",
						"",
						"12%",
						"https://thumb.ibb.co/cO5waa/fruits.jpg"
				));

		listOfCategory
				.add(new ProductCategoryModel(
						"Grains",
						"",
						"15%",
						"https://thumb.ibb.co/fBuNFa/grains.jpg"));


		GlobaDataHolder.getGlobaDataHolder().setListOfCategory(listOfCategory);
	}

	public void getVeg() {

		ConcurrentHashMap<String, ArrayList<Product>> productMap = new ConcurrentHashMap<String, ArrayList<Product>>();

		ArrayList<Product> productlist = new ArrayList<Product>();

		 //Ovens
		productlist
				.add(new Product(
						"Potato",
				"per kg",
				"enjoy",
				"20",
				"10",
				"50",
				"0",
				"https://thumb.ibb.co/gdezva/fmango.jpg",
				""));

 	productlist
				.add(new Product(
						"Solo Microwave Oven",
						"Bajaj 1701MT 17 L Solo Microwave Oven",
						"Explore the joys of cooking with IFB 17PM MEC1 Solo Microwave Oven. The budget-friendly appliance has several nifty features including Multi Power Levels and Speed Defrost to make cooking a fun-filled experience.",
						"5490",
						"10",
						"4290",
						"0",
						"http://img6a.flixcart.com/image/microwave-new/z/j/p/bajaj-1701mt-400x400-imae4ty4vyzhaagz.jpeg",
						""));

		productlist
				.add(new Product(
						"Solo Microwave Oven",
						"Whirlpool MW 25 BG 25 L Grill Microwave Oven",
						"http://img6a.flixcart.com/image/microwave-new/a/y/f/whirlpool-mw-25-bg-400x400-imaebagzstnngjqt.jpeg",
						"5490",
						"10",
						"4290",
						"0",
						"http://img6a.flixcart.com/image/microwave-new/z/j/p/bajaj-1701mt-400x400-imae4ty4vyzhaagz.jpeg",
						""));

		productlist
				.add(new Product(
						"Solo Microwave Oven",
						"Morphy Richards 25CG 25 L Convection Microwave Oven",
						"http://img5a.flixcart.com/image/microwave-new/v/q/y/morphy-richard-25cg-400x400-imadxecx93kb6q4f.jpeg",
						"5490",
						"10",
						"4290",
						"0",
						"http://img6a.flixcart.com/image/microwave-new/z/j/p/bajaj-1701mt-400x400-imae4ty4vyzhaagz.jpeg",
						""));

		productlist
				.add(new Product(
						"Solo Microwave Oven",
						"IFB 25SC4 25 L Convection Microwave Oven",
						"http://img5a.flixcart.com/image/microwave-new/v/q/y/morphy-richard-25cg-400x400-imadxecx93kb6q4f.jpeg",
						"5490",
						"10",
						"4290",
						"0",
						"http://img6a.flixcart.com/image/microwave-new/y/k/m/ifb-25sc4-400x400-imaef2pztynvqjaf.jpeg",
						""));

		productMap.put("Microwave oven", productlist);

		ArrayList<Product> tvList = new ArrayList<Product>();
//
//		// TV
//		tvList.add(new Product(
//				"Potato",
//				"per kg",
//				"",
//				"20",
//				"",
//				"",
//				"0",
//				"",
//				""));
//
//		tvList.add(new Product(
//				"Brinjal",
//				"per kg",
//				"",
//				"25",
//				"",
//				"",
//				"0",
//				"",
//				""));
//
//		tvList.add(new Product(
//				"Tomato",
//				"per kg",
//				"",
//				"30",
//				"",
//				"",
//				"0",
//				"",
//				""));
//
//		tvList.add(new Product(
//				"Bitter gourd",
//				"per kg",
//				"",
//				"30",
//				"",
//				"",
//				"0",
//				"",
//				""));
//
//		tvList.add(new Product(
//				"Cabbage",
//				"per kg",
//				"",
//				"30",
//				"",
//				"",
//				"0",
//				"",
//				""));
//		tvList.add(new Product(
//				"Carrot",
//				"per kg",
//				"",
//				"30",
//				"",
//				"",
//				"0",
//				"",
//				""));
//		tvList.add(new Product(
//				"Lady Finger",
//				"per kg",
//				"",
//				"25",
//				"",
//				"",
//				"0",
//				"",
//				""));
//		tvList.add(new Product(
//				"Peas",
//				"per kg",
//				"",
//				"35",
//				"",
//				"",
//				"0",
//				"",
//				""));
//
//		productMap.put("Vegetables", tvList);

		//productlist = new ArrayList<Product>();

//		// Vaccum Cleaner
//		productlist
//				.add(new Product(
//						"Easy Clean Plus Hand-held ",
//						"Eureka Forbes Easy Clean Plus Hand-held Vacuum Cleaner",
//						"The Eureka Forbes Easy Clean vacuum cleaner is best for those who are looking for a machine that makes cleaning easier and is convenient to use. It is a compact and powerful machine with high suction and low power consumption.",
//						"2699",
//						"10",
//						"2566",
//						"0",
//						"http://img5a.flixcart.com/image/vacuum-cleaner/e/e/g/eureka-forbes-easy-clean-easy-clean-plus-400x400-imae7dam5ey3vaeb.jpeg",
//						""));
//
//		productlist
//				.add(new Product(
//						"Easy Clean Plus Hand-held ",
//						"Eureka Forbes Easy Clean Plus Hand-held Vacuum Cleaner",
//						"The Eureka Forbes Easy Clean vacuum cleaner is best for those who are looking for a machine that makes cleaning easier and is convenient to use. It is a compact and powerful machine with high suction and low power consumption.",
//						"2699",
//						"10",
//						"2566",
//						"0",
//						"http://img6a.flixcart.com/image/vacuum-cleaner/j/e/x/nova-vc-761h-plus-vacuum-cleaner-400x400-imaecmhyadgxzzpg.jpeg",
//						""));
//
//		productlist
//				.add(new Product(
//						"Easy Clean Plus Hand-held ",
//						"Eureka Forbes Easy Clean Plus Hand-held Vacuum Cleaner",
//						"The Eureka Forbes Easy Clean vacuum cleaner is best for those who are looking for a machine that makes cleaning easier and is convenient to use. It is a compact and powerful machine with high suction and low power consumption.",
//						"2699",
//						"10",
//						"2566",
//						"0",
//						"http://img6a.flixcart.com/image/vacuum-cleaner/y/g/b/eureka-forbes-car-clean-car-clean-400x400-imae376v2kta5utj.jpeg",
//						""));
//
//		productlist
//				.add(new Product(
//						"Easy Clean Plus Hand-held ",
//						"Eureka Forbes Easy Clean Plus Hand-held Vacuum Cleaner",
//						"The Eureka Forbes Easy Clean vacuum cleaner is best for those who are looking for a machine that makes cleaning easier and is convenient to use. It is a compact and powerful machine with high suction and low power consumption.",
//						"2699",
//						"10",
//						"2566",
//						"0",
//						"http://img5a.flixcart.com/image/vacuum-cleaner/m/y/g/sarita-115-400x400-imae9b5zhzjagykx.jpeg",
//						""));
//
//		productlist
//				.add(new Product(
//						"Easy Clean Plus Hand-held ",
//						"Eureka Forbes Easy Clean Plus Hand-held Vacuum Cleaner",
//						"The Eureka Forbes Easy Clean vacuum cleaner is best for those who are looking for a machine that makes cleaning easier and is convenient to use. It is a compact and powerful machine with high suction and low power consumption.",
//						"2699",
//						"10",
//						"2566",
//						"0",
//						"http://img6a.flixcart.com/image/vacuum-cleaner/s/c/j/eureka-forbes-trendy-steel-trendy-steel-400x400-imae7vashkfj2hgk.jpeg",
//						""));
//
//		productMap.put("Vaccum Cleaner", productlist);

		GlobaDataHolder.getGlobaDataHolder().setProductMap(productMap);

	}

	public void getFruits() {

		ConcurrentHashMap<String, ArrayList<Product>> productMap = new ConcurrentHashMap<String, ArrayList<Product>>();

		ArrayList<Product> productlist = new ArrayList<Product>();

		// Fruits
		productlist
				.add(new Product(
						" Mango",
						"Talala gir kesar mango",
						"Fresh Mango .",
						"100",
						"10",
						"90",
						"0",
						"https://thumb.ibb.co/gdezva/fmango.jpg",
						""));

		productlist
				.add(new Product(
						" Apple",
						"Kasmir's Apple",
						"Apple is healthy for human blood circulation .",
						"150",
						"10",
						"130",
						"0",
						"https://thumb.ibb.co/iJ4zva/fapple.png",
						""));

		productlist
				.add(new Product(
						" Pineapple",
						"New Pineapple",
						"With best made jucee.",
						"100",
						"5",
						"95",
						"0",
						"https://thumb.ibb.co/k1XKva/fpineapple.jpg",
						""));

		productlist
				.add(new Product(
						" Kiwi",
						"Royal kiwi",
						"fresh kiwi available in market.",
						"70",
						"5",
						"62",
						"0",
						"https://thumb.ibb.co/ckKA1F/fkiwi.jpg",
						""));

		productlist
				.add(new Product(
						" Strawberry",
						"Americal Fruits",
						"Fresh .",
						"10200",
						"12",
						"7000",
						"0",
						"https://thumb.ibb.co/jtsxgF/fstrawberry.jpg",
						""));

		productlist
				.add(new Product(
						" Orange",
						"Fresh orange",
						"orange special for summer.",
						"50",
						"10",
						"45",
						"0",
						"https://thumb.ibb.co/e6qiMF/forange.jpg",
						""));

		productlist
				.add(new Product(
						" Banana",
						"Fresh",
						"Fresh new Banana.",
						"30",
						"10",
						"25",
						"0",
						"https://thumb.ibb.co/nmdg8v/fbanana.jpg",
						""));

		productlist
				.add(new Product(
						" Watermelon",
						"special for summer ",
						"new special.",
						"20",
						"10",
						"18",
						"0",
						"https://thumb.ibb.co/mCWZTv/fwatermelon.jpg",
						""));



		productMap.put("Fruits", productlist);

		productlist = new ArrayList<Product>();

		// Chair
//		productlist
//				.add(new Product(
//						"Bean Bag Chair Cover",
//						"ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
//						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
//						"36500",
//						"20",
//						"1200",
//						"0",
//						"http://img5a.flixcart.com/image/bean-bag/5/b/b/boss-moda-chair-br1088-comf-on-xxxl-400x400-imae9k78vg8gjh3q.jpeg",
//						""));
//
//		productlist
//				.add(new Product(
//						"Bean Bag Chair Cover",
//						"ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
//						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
//						"36500",
//						"20",
//						"1200",
//						"0",
//						"http://img6a.flixcart.com/image/office-study-chair/e/f/p/flversaossblu-stainless-steel-nilkamal-400x400-imaeeptqczc5kbjg.jpeg",
//						""));
//
//		productlist
//				.add(new Product(
//						"Bean Bag Chair Cover",
//						"ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
//						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
//						"36500",
//						"20",
//						"1200",
//						"0",
//						"http://img5a.flixcart.com/image/bean-bag/7/w/b/chr-01-fab-homez-xxxl-400x400-imae9qnbfwr9vkk4.jpeg",
//						""));
//
//		productlist
//				.add(new Product(
//						"Adiko Leatherette Office Chair",
//						"ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
//						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
//						"36500",
//						"20",
//						"1200",
//						"0",
//						"http://img5a.flixcart.com/image/office-study-chair/h/z/d/adxn275-pu-leatherette-adiko-400x400-imaedpmyhzefdzgz.jpeg",
//						""));
//
//		productlist
//				.add(new Product(
//						"Adiko Leatherette Office Chair",
//						"ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
//						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
//						"36500",
//						"20",
//						"1200",
//						"0",
//						"http://img5a.flixcart.com/image/office-study-chair/h/z/d/adxn275-pu-leatherette-adiko-400x400-imaedpmyytefgvz7.jpeg",
//						""));
//
//		productlist
//				.add(new Product(
//						"Adiko Leatherette Office Chair",
//						"ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
//						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
//						"36500",
//						"20",
//						"1200",
//						"0",
//						"http://img6a.flixcart.com/image/office-study-chair/j/y/q/adpn-d021-pp-adiko-400x400-imaee2vrg9bkkxjg.jpeg",
//						""));
//
//		productlist
//				.add(new Product(
//						"Adiko Leatherette Office Chair",
//						"ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
//						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
//						"36500",
//						"20",
//						"1200",
//						"0",
//						"http://img6a.flixcart.com/image/office-study-chair/k/s/2/adxn-034-pu-leatherette-adiko-400x400-imaedpmyyyg8bdmv.jpeg",
//						""));
//
//		productlist
//				.add(new Product(
//						"Adiko Leatherette Office Chair",
//						"ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
//						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
//						"36500",
//						"20",
//						"1200",
//						"0",
//						"http://img6a.flixcart.com/image/bean-bag/t/8/n/fk0100391-star-xxxl-400x400-imae72dsb5h2r9uj.jpeg",
//						""));
//
//		productlist
//				.add(new Product(
//						"Adiko Leatherette Office Chair",
//						"ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
//						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
//						"36500",
//						"20",
//						"1200",
//						"0",
//						"http://img5a.flixcart.com/image/bean-bag/3/h/w/rydclassicgreenl-rockyard-large-400x400-imae6zfaz6qzj3jd.jpeg",
//						""));
//
//		productMap.put("Chairs", productlist);

		//productlist = new ArrayList<Product>();

		// Almirah
//		productlist
//				.add(new Product(
//						"l Collapsible Wardrobe",
//						"Everything Imported Carbon Steel Collapsible Wardrobe",
//						"Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
//						"2999",
//						"20",
//						"1999",
//						"0",
//						"http://img5a.flixcart.com/image/collapsible-wardrobe/h/h/g/best-quality-3-5-feet-foldable-storage-cabinet-almirah-shelf-400x400-imaees5fq7wbndak.jpeg",
//						""));
//
//		productlist
//				.add(new Product(
//						"l Collapsible Wardrobe",
//						"Everything Imported Carbon Steel Collapsible Wardrobe",
//						"Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
//						"2999",
//						"20",
//						"1999",
//						"0",
//						"http://img6a.flixcart.com/image/collapsible-wardrobe/d/n/s/cb265-carbon-steel-cbeeso-dark-beige-400x400-imaefn9vha2hm9qk.jpeg",
//						""));
//
//		productlist
//				.add(new Product(
//						"l Collapsible Wardrobe",
//						"Everything Imported Carbon Steel Collapsible Wardrobe",
//						"Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
//						"2999",
//						"20",
//						"1999",
//						"0",
//						"http://img6a.flixcart.com/image/wardrobe-closet/b/v/3/srw-146-jute-pindia-blue-400x400-imaeb9g4y6tegzfn.jpeg",
//						""));
//
//		productlist
//				.add(new Product(
//						"l Collapsible Wardrobe",
//						"Everything Imported Carbon Steel Collapsible Wardrobe",
//						"Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
//						"2999",
//						"20",
//						"1999",
//						"0",
//						"http://img6a.flixcart.com/image/cupboard-almirah/y/w/q/100009052-particle-board-housefull-mahogany-400x400-imaebazkwhv64p8q.jpeg",
//						""));
//
//		productlist
//				.add(new Product(
//						"l Collapsible Wardrobe",
//						"Everything Imported Carbon Steel Collapsible Wardrobe",
//						"Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
//						"2999",
//						"20",
//						"1999",
//						"0",
//						"http://img5a.flixcart.com/image/collapsible-wardrobe/w/c/k/srw-116a-aluminium-pindia-maroon-wardrobe-400x400-imaeb9g4945dqunu.jpeg",
//						""));
//
//		productlist
//				.add(new Product(
//						"Metal Free Standing Wardrobe",
//						"Everything Imported Carbon Steel Collapsible Wardrobe",
//						"Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
//						"2999",
//						"20",
//						"1999",
//						"0",
//						"http://img6a.flixcart.com/image/wardrobe-closet/f/b/p/srw-167-jute-pindia-purple-400x400-imaeb9g4d8uvatck.jpeg",
//						""));
//
//		productMap.put("Almirah", productlist);

		GlobaDataHolder.getGlobaDataHolder().setProductMap(productMap);

	}

	public void getGrains() {

		ConcurrentHashMap<String, ArrayList<Product>> productMap = new ConcurrentHashMap<String, ArrayList<Product>>();

		ArrayList<Product> productlist = new ArrayList<Product>();

		//Ovens
		productlist
				.add(new Product(
						"Potato",
						"per kg",
						"enjoy",
						"20",
						"10",
						"50",
						"0",
						"https://thumb.ibb.co/gdezva/fmango.jpg",
						""));

		productlist
				.add(new Product(
						"Solo Microwave Oven",
						"Bajaj 1701MT 17 L Solo Microwave Oven",
						"Explore the joys of cooking with IFB 17PM MEC1 Solo Microwave Oven. The budget-friendly appliance has several nifty features including Multi Power Levels and Speed Defrost to make cooking a fun-filled experience.",
						"5490",
						"10",
						"4290",
						"0",
						"http://img6a.flixcart.com/image/microwave-new/z/j/p/bajaj-1701mt-400x400-imae4ty4vyzhaagz.jpeg",
						""));

		productlist
				.add(new Product(
						"Solo Microwave Oven",
						"Whirlpool MW 25 BG 25 L Grill Microwave Oven",
						"http://img6a.flixcart.com/image/microwave-new/a/y/f/whirlpool-mw-25-bg-400x400-imaebagzstnngjqt.jpeg",
						"5490",
						"10",
						"4290",
						"0",
						"http://img6a.flixcart.com/image/microwave-new/z/j/p/bajaj-1701mt-400x400-imae4ty4vyzhaagz.jpeg",
						""));

		productlist
				.add(new Product(
						"Solo Microwave Oven",
						"Morphy Richards 25CG 25 L Convection Microwave Oven",
						"http://img5a.flixcart.com/image/microwave-new/v/q/y/morphy-richard-25cg-400x400-imadxecx93kb6q4f.jpeg",
						"5490",
						"10",
						"4290",
						"0",
						"http://img6a.flixcart.com/image/microwave-new/z/j/p/bajaj-1701mt-400x400-imae4ty4vyzhaagz.jpeg",
						""));

		productlist
				.add(new Product(
						"Solo Microwave Oven",
						"IFB 25SC4 25 L Convection Microwave Oven",
						"http://img5a.flixcart.com/image/microwave-new/v/q/y/morphy-richard-25cg-400x400-imadxecx93kb6q4f.jpeg",
						"5490",
						"10",
						"4290",
						"0",
						"http://img6a.flixcart.com/image/microwave-new/y/k/m/ifb-25sc4-400x400-imaef2pztynvqjaf.jpeg",
						""));

		productMap.put("Microwave oven", productlist);

		ArrayList<Product> tvList = new ArrayList<Product>();
//
//		// TV
//		tvList.add(new Product(
//				"Potato",
//				"per kg",
//				"",
//				"20",
//				"",
//				"",
//				"0",
//				"",
//				""));
//
//		tvList.add(new Product(
//				"Brinjal",
//				"per kg",
//				"",
//				"25",
//				"",
//				"",
//				"0",
//				"",
//				""));
//
//		tvList.add(new Product(
//				"Tomato",
//				"per kg",
//				"",
//				"30",
//				"",
//				"",
//				"0",
//				"",
//				""));
//
//		tvList.add(new Product(
//				"Bitter gourd",
//				"per kg",
//				"",
//				"30",
//				"",
//				"",
//				"0",
//				"",
//				""));
//
//		tvList.add(new Product(
//				"Cabbage",
//				"per kg",
//				"",
//				"30",
//				"",
//				"",
//				"0",
//				"",
//				""));
//		tvList.add(new Product(
//				"Carrot",
//				"per kg",
//				"",
//				"30",
//				"",
//				"",
//				"0",
//				"",
//				""));
//		tvList.add(new Product(
//				"Lady Finger",
//				"per kg",
//				"",
//				"25",
//				"",
//				"",
//				"0",
//				"",
//				""));
//		tvList.add(new Product(
//				"Peas",
//				"per kg",
//				"",
//				"35",
//				"",
//				"",
//				"0",
//				"",
//				""));
//
//		productMap.put("Vegetables", tvList);

		//productlist = new ArrayList<Product>();

//		// Vaccum Cleaner
//		productlist
//				.add(new Product(
//						"Easy Clean Plus Hand-held ",
//						"Eureka Forbes Easy Clean Plus Hand-held Vacuum Cleaner",
//						"The Eureka Forbes Easy Clean vacuum cleaner is best for those who are looking for a machine that makes cleaning easier and is convenient to use. It is a compact and powerful machine with high suction and low power consumption.",
//						"2699",
//						"10",
//						"2566",
//						"0",
//						"http://img5a.flixcart.com/image/vacuum-cleaner/e/e/g/eureka-forbes-easy-clean-easy-clean-plus-400x400-imae7dam5ey3vaeb.jpeg",
//						""));
//
//		productlist
//				.add(new Product(
//						"Easy Clean Plus Hand-held ",
//						"Eureka Forbes Easy Clean Plus Hand-held Vacuum Cleaner",
//						"The Eureka Forbes Easy Clean vacuum cleaner is best for those who are looking for a machine that makes cleaning easier and is convenient to use. It is a compact and powerful machine with high suction and low power consumption.",
//						"2699",
//						"10",
//						"2566",
//						"0",
//						"http://img6a.flixcart.com/image/vacuum-cleaner/j/e/x/nova-vc-761h-plus-vacuum-cleaner-400x400-imaecmhyadgxzzpg.jpeg",
//						""));
//
//		productlist
//				.add(new Product(
//						"Easy Clean Plus Hand-held ",
//						"Eureka Forbes Easy Clean Plus Hand-held Vacuum Cleaner",
//						"The Eureka Forbes Easy Clean vacuum cleaner is best for those who are looking for a machine that makes cleaning easier and is convenient to use. It is a compact and powerful machine with high suction and low power consumption.",
//						"2699",
//						"10",
//						"2566",
//						"0",
//						"http://img6a.flixcart.com/image/vacuum-cleaner/y/g/b/eureka-forbes-car-clean-car-clean-400x400-imae376v2kta5utj.jpeg",
//						""));
//
//		productlist
//				.add(new Product(
//						"Easy Clean Plus Hand-held ",
//						"Eureka Forbes Easy Clean Plus Hand-held Vacuum Cleaner",
//						"The Eureka Forbes Easy Clean vacuum cleaner is best for those who are looking for a machine that makes cleaning easier and is convenient to use. It is a compact and powerful machine with high suction and low power consumption.",
//						"2699",
//						"10",
//						"2566",
//						"0",
//						"http://img5a.flixcart.com/image/vacuum-cleaner/m/y/g/sarita-115-400x400-imae9b5zhzjagykx.jpeg",
//						""));
//
//		productlist
//				.add(new Product(
//						"Easy Clean Plus Hand-held ",
//						"Eureka Forbes Easy Clean Plus Hand-held Vacuum Cleaner",
//						"The Eureka Forbes Easy Clean vacuum cleaner is best for those who are looking for a machine that makes cleaning easier and is convenient to use. It is a compact and powerful machine with high suction and low power consumption.",
//						"2699",
//						"10",
//						"2566",
//						"0",
//						"http://img6a.flixcart.com/image/vacuum-cleaner/s/c/j/eureka-forbes-trendy-steel-trendy-steel-400x400-imae7vashkfj2hgk.jpeg",
//						""));
//
//		productMap.put("Vaccum Cleaner", productlist);

		GlobaDataHolder.getGlobaDataHolder().setProductMap(productMap);

	}

	public static FakeWebServer getFakeWebServer() {

		if (null == fakeServer) {
			fakeServer = new FakeWebServer();
		}
		return fakeServer;
	}

	public void getAllProducts(int productCategory) {

		if (productCategory == 0) {
			getVeg();
		} else if(productCategory == 1) {
			getFruits();
		} else if(productCategory ==2){
			getGrains();
//			Log.d("mylog","grains");
//			Toast.makeText(mm, "grains", Toast.LENGTH_SHORT).show();

		}


	}

}
