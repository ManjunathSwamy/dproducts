package com.deloitte.ecommerce.dkartproducts.controller;

import org.apache.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dkart/api")
public class DKartEcommerceProductsController {
	final static Logger LOG = Logger.getLogger(DKartEcommerceProductsController.class);


	@RequestMapping(value="/products", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String getProducts(@RequestParam(value="searchTerm", required=true) String searchTerm) throws Exception {
		LOG.debug("Get Products for " + searchTerm);
		//Products products = dKartEcommerceProductsService.getProducts(searchTerm);
		return "{\"data\":[{\"productId\":\"1\",\"title\":\"Gaming Laptop\",\"description\":\"Gaming Laptop with the strongest keyboards and displays on the market.\",\"originalPrice\":\"1249.9\",\"finalPrice\":\"962.42\",\"productImage\":\"Laptop.jpg\",\"category\":\"Electronics\",\"isDiscounted\":true},{\"productId\":\"2\",\"title\":\"Nikon DSLR\",\"description\":\"Take your photography skill to the next level.\",\"originalPrice\":\"450.0\",\"finalPrice\":\"414.0\",\"productImage\":\"nikon-dslr.jpg\",\"category\":\"Electronics\",\"isDiscounted\":true},{\"productId\":\"3\",\"title\":\"Laptop Charger\",\"description\":\"Brand new Laptop Charger\",\"originalPrice\":\"50.0\",\"finalPrice\":\"47.5\",\"productImage\":\"laptop-charger.jpg\",\"category\":\"Electronics\",\"isDiscounted\":true},{\"productId\":\"4\",\"title\":\"PowerBank\",\"description\":\"IA powerful PowerBank with 20,000mAH capacity\",\"originalPrice\":\"10.9\",\"finalPrice\":\"10.36\",\"productImage\":\"PowerBank.jpg\",\"category\":\"Electronics\",\"isDiscounted\":true},{\"productId\":\"5\",\"title\":\"HeadPhones\",\"description\":\"Noise cancellation headphones\",\"originalPrice\":\"587.9\",\"finalPrice\":\"529.11\",\"productImage\":\"HeadhPhone.jpg\",\"category\":\"Electronics\",\"isDiscounted\":true},{\"productId\":\"6\",\"title\":\"Flash Drive\",\"description\":\"Blazing Fast 3.0 Flash Drive\",\"originalPrice\":\"7.99\",\"finalPrice\":\"7.03\",\"productImage\":\"PenDrive.jpg\",\"category\":\"Electronics\",\"isDiscounted\":true},{\"productId\":\"7\",\"title\":\"Laptop XPS\",\"description\":\"Laptop best suited for Home needs\",\"originalPrice\":\"879.99\",\"finalPrice\":\"844.79\",\"productImage\":\"LaptopXps.jpg\",\"category\":\"Electronics\",\"isDiscounted\":true},{\"productId\":\"8\",\"title\":\"Point and Shoot Camera\",\"description\":\"Nikon P7100 Compact Digita Camera\",\"originalPrice\":\"369.99\",\"finalPrice\":\"351.49\",\"productImage\":\"PointShoot.jpg\",\"category\":\"Electronics\",\"isDiscounted\":true},{\"productId\":\"9\",\"title\":\"Selfie Stick\",\"description\":\"Selfie Stick with bluetooth\",\"originalPrice\":\"9.99\",\"finalPrice\":\"9.69\",\"productImage\":\"SelfieStick.jpg\",\"category\":\"Electronics\",\"isDiscounted\":true},{\"productId\":\"10\",\"title\":\"Kookabura\",\"description\":\"Kookabura English Willow Bat\",\"originalPrice\":\"89.99\",\"finalPrice\":\"86.39\",\"productImage\":\"Kookabura.jpg\",\"category\":\"Sports\",\"isDiscounted\":true},{\"productId\":\"11\",\"title\":\"SS Bat Mallet\",\"description\":\"SG Leather Ball Bat Mallet\",\"originalPrice\":\"19.99\",\"finalPrice\":\"19.19\",\"productImage\":\"BatMallet.jpg\",\"category\":\"Sports\",\"isDiscounted\":true},{\"productId\":\"12\",\"title\":\"Nike Football Cleats\",\"description\":\"Nike Football Cleats\",\"originalPrice\":\"79.99\",\"finalPrice\":\"77.59\",\"productImage\":\"Studs.jpg\",\"category\":\"Sports\",\"isDiscounted\":true},{\"productId\":\"13\",\"title\":\"Badminton Racquet\",\"description\":\"ultra Light Weight Racquet\",\"originalPrice\":\"69.99\",\"finalPrice\":\"67.89\",\"productImage\":\"BadmintonRacquet.jpg\",\"category\":\"Sports\",\"isDiscounted\":true},{\"productId\":\"14\",\"title\":\"Tennis Racquet\",\"description\":\"Wilson Tennis Racquet\",\"originalPrice\":\"99.99\",\"finalPrice\":\"94.99\",\"productImage\":\"TennisRacquet.jpg\",\"category\":\"Sports\",\"isDiscounted\":true},{\"productId\":\"15\",\"title\":\"Cricket kit Bag\",\"description\":\"Kit Bag with Wheels\",\"originalPrice\":\"29.99\",\"finalPrice\":\"28.49\",\"productImage\":\"CricketKitBag.jpg\",\"category\":\"Sports\",\"isDiscounted\":true},{\"productId\":\"16\",\"title\":\"Gym Bag\",\"description\":\"Dedicated Gym Bag\",\"originalPrice\":\"11.99\",\"finalPrice\":\"11.39\",\"productImage\":\"Gymbag.jpg\",\"category\":\"Sports\",\"isDiscounted\":true},{\"productId\":\"17\",\"title\":\"File Folder\",\"description\":\"Premium Leather file folder\",\"originalPrice\":\"7.99\",\"finalPrice\":\"7.83\",\"productImage\":\"LeatherFileFolder.jpg\",\"category\":\"Stationaries\",\"isDiscounted\":true},{\"productId\":\"18\",\"title\":\"Pen Holder\",\"description\":\"Pen Holder With Calendar\",\"originalPrice\":\"10.99\",\"finalPrice\":\"10.77\",\"productImage\":\"PenHolder.jpg\",\"category\":\"Stationaries\",\"isDiscounted\":true},{\"productId\":\"19\",\"title\":\"Crayons\",\"description\":\"8 Jumbo Crayons Pack\",\"originalPrice\":\"13.99\",\"finalPrice\":\"13.71\",\"productImage\":\"Crayons.jpg\",\"category\":\"Stationaries\",\"isDiscounted\":true}]}";
	}
	
	@RequestMapping(value="/products/{productId}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String getProductDetails(@PathVariable Integer productId,@RequestHeader(value="Cart-ID", required = false) Integer cartId) throws Exception {
		LOG.debug("Get Product Details for " + productId);
		//ProductDetails productDetails = dKartEcommerceProductsService.getProductDetails(productId,cartId);
		return "{\"productId\":1,\"productTitle\":\"A gaming computer is a personal computer designed for playing computationally demanding video games\",\"productImage\":\"Laptop.jpg\",\"description\":\"Gaming Laptop with the strongest keyboards and displays on the market.Core i7 7th Gen - (16 GB\\/1 TB HDD\\/256 GB SSD\\/Windows 10 Home\\/4 GB Graphics) 7567 Gaming Laptop  (15.6 inch, Matt Black, 2.62 kg)\",\"isInCart\":false,\"originalPrice\":\"1249.9\",\"finalPrice\":\"962.42\",\"isDiscounted\":true}";
	}
}
