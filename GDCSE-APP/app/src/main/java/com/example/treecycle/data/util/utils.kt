package com.example.treecycle.data.util

import com.example.treecycle.R
import com.example.treecycle.presentation.education.adapter.Chapter
import com.example.treecycle.presentation.recycle.adapter.RecycleItem


const val YOUTUBE_API_KEY = "AIzaSyC7RHZgkGcA28CynZz64dZCfnmD4SDeCss"

data class ChapterCard(val hashTag: String, val content: String)

val homeBanners = arrayListOf(R.drawable.img_test_banner, R.drawable.img_test_banner)
val educationBanners =
    arrayListOf(R.drawable.img_education_test_banner, R.drawable.img_education_test_banner)
val doYouKnowBanners = arrayListOf(R.drawable.img_info_banner_test, R.drawable.img_info_banner_test)

/* Chapter Cards for Climate change education. */
val chapterCards = arrayListOf(
    ChapterCard(
        "What is Climate Change ?",
        content = "Climate change refers to the long-term shift in the Earth's climate patterns and temperatures, primarily caused by human activities such as deforestation, burning of fossil fuels and other greenhouse gas emissions. The impacts of climate change are wide-ranging and can be seen in more frequent and intense weather events, rising sea levels, melting glaciers, and ocean acidification. These changes pose a significant threat to human health, wildlife, and the environment."
    ),
    ChapterCard(
        "Climate Change is a big issue",
        "1. Rising temperatures: Climate change is causing global temperatures to rise, " +
                "leading to melting glaciers, rising sea levels, and more frequent and intense heat " +
                "waves.\n" +
                "2. Extreme weather events: Climate change is increasing the frequency and severity " +
                "of extreme weather events, such as hurricanes, droughts, and floods, which can " +
                "have devastating impacts on communities and ecosystems."
    ),
    ChapterCard(
        "Climate Change is a big issue",
        "3. Loss of biodiversity: Climate change is causing widespread changes in " +
                "ecosystems, including loss of habitats and species extinction, which can have " +
                "far-reaching impacts on the planet's biodiversity.\n" +
                "4. Threats to food security: Changes in weather patterns and increased frequency " +
                "of extreme weather events can disrupt food production, putting pressure on " +
                "global food supplies and potentially causing food shortages."
    ),
    ChapterCard(
        "Climate Change is a big issue",
        "5. Economic impacts: Climate change can have significant economic impacts " +
                "including increased costs of natural disasters, reduced productivity, and " +
                "decreased economic growth.\n" +
                "6. Public health impacts: Climate change can have serious impacts on public " +
                "health, including increased air pollution, spread of disease through insects and " +
                "pests, and heat stress.\n" +
                "7. Intergenerational injustice: Climate change is affecting the planet for " +
                "generations to come, and future generations will bear the brunt of its impacts " +
                "unless action is taken now."
    )
)
val chapter2Cards = arrayListOf(
    ChapterCard(
        "Reason of Climate Change",
        content = "Climate science is the study of the Earth's climate and how it changes over time.\n" +
                "It involves the observation, measurement, and analysis of various climate factors,\n" +
                "including temperature, precipitation, atmospheric circulation, and greenhouse\n" +
                "gas concentrations, to understand how the climate system works and how it is\n" +
                "influenced by natural and human factors."
    ),
    ChapterCard(
        "Why is the climate changing ?",
        "1. Greenhouse gas emissions: The main cause of climate change is the release of\n" +
                "greenhouse gasses, such as carbon dioxide, into the atmosphere. This is mainly " +
                "due to the burning of fossil fuels, deforestation, and other human activities. \n" +
                "" +
                "2. Trapping heat: Greenhouse gasses trap heat from the sun and cause the planet\n" +
                "to warm, leading to changes in climate patterns and global temperatures.\n" +
                "\n" +
                "3. Melting glaciers and rising sea levels: The warming of the planet is causing\n" +
                "melting of glaciers, which is leading to rising sea levels and increased risk of\n" +
                "flooding."
    ),
    ChapterCard(
        "Why is climate changing ?",
    "4. Intense heat waves: The warming of the planet is causing more frequent and\n" +
            "intense heat waves, which can have serious impacts on public health and food " +
            "production.\n" +
            "5. Extreme weather events: Climate change is increasing the frequency and severity" +
            "of extreme weather events, such as hurricanes, droughts, and floods, which can " +
            "have devastating impacts on communities and ecosystems."
    ),
    ChapterCard(
        "# Why is climate changing ?",
        "6. Changes in weather patterns: The warming of the ocean is causing changes in " +
                "weather patterns and increasing the frequency and severity of extreme weather " +
                "events.\n" +
                "7. Mitigation efforts: To address the impacts of climate change, it is important that " +
                "we take steps to reduce our greenhouse gas emissions and transition to a more " +
                "sustainable and low-carbon economy."
    )
)
val chapter3Cards = arrayListOf(
    ChapterCard(
        "Global Impact",
                "The burning of fossil fuels releases carbon dioxide into the atmosphere, which " +
                "traps heat and causes the planet to warm. This warming is leading to melting " +
                "glaciers, rising sea levels, and more frequent and intense heat waves, which are " +
                "causing widespread impacts on the planet's ecosystems and communities. In " +
                "addition, the warming of the ocean is causing changes in weather patterns and " +
                "increasing the frequency and severity of extreme weather events, such as " +
                "hurricanes, droughts, and floods."
    ),
    ChapterCard(
        "Facts and Figures",
        "1. The average global temperature has increased by about 1.1°C since the late 19th " +
                "century, with the majority of that increase taking place in the past few decades.\n" +
                "2. Sea levels have risen by about 8 inches (21 cm) since 1880, with almost half of " +
                "that rise occurring in the past 25 years.\n" +
                "3. The Arctic sea ice is declining rapidly, with the summer sea ice extent declining " +
                "by about 12% per decade since 1979."
    ),
    ChapterCard(
        "Facts and Figures",
        "4. Greenhouse gas concentrations, primarily carbon dioxide (CO2), are at their " +
                "highest levels in at least 800,000 years, with CO2 levels increasing by about 40% " +
                "since the pre-industrial era.\n" +
                "5. Human activities, such as burning fossil fuels and deforestation, are responsible " +
                "for over 70% of the increase in greenhouse gas concentrations.\n" +
                "6. The frequency and intensity of extreme weather events, such as heatwaves and " +
                "hurricanes, are increasing as a result of climate change."
    ),
    ChapterCard(
        "Facts and Figures",
        "7. Climate change is already affecting the world's oceans, leading to coral reef " +
                "die-off, ocean acidification, and changes in ocean currents and temperatures.\n" +
                "8. Climate change is also having a significant impact on wildlife, leading to range " +
                "shifts and species extinction.\n" +
                "9. The economic cost of climate change is estimated to be in the trillions of dollars,\n" +
                "with impacts ranging from decreased crop yields to increased infrastructure " +
                "damage from extreme weather events."
    )
)
val chapter4Cards = arrayListOf(
    ChapterCard(
        "Relationship of climate change and Financial Markets",
        "Climate change affects the financial market by creating new opportunities, " +
                "affecting business profits and changing investment strategies. It also involves " +
                "investment in low-carbon energy and climate change solutions, as well as " +
                "financial risks. This highlights the importance of considering the financial impact " +
                "of climate change in investment decisions."
    ),
    ChapterCard(
        "Impact on Financial Markets",
        "1. Carbon pricing: Climate change policies, such as carbon taxes and cap-and-trade " +
                "systems, can impact the financial market by creating new costs for businesses " +
                "and increasing the prices of goods and services that generate greenhouse gas " +
                "emissions. This can affect the profitability of companies and the prices of stocks " +
                "and bonds in the financial market.\n" +
                "2. Energy transition: The shift towards low-carbon energy sources, such as " +
                "renewable energy and electric vehicles, can disrupt traditional energy companies " +
                "and create opportunities for new companies and technologies in the financial " +
                "market."
    ),
    ChapterCard(
        "Impact on Financial Markets",
        "3. Infrastructure investments: The need to adapt to the impacts of climate change " +
                "and to transition to a low-carbon economy requires significant investments in " +
                "new infrastructure, such as renewable energy generation, energy efficient " +
                "buildings, and low-carbon transportation systems. These investments can create " +
                "opportunities for financial institutions and investors to support low-carbon " +
                "development and reap the benefits of a transition to a sustainable economy."
    ),
    ChapterCard(
        "Impact on Financial Markets",
        "4. Climate risks: Climate change poses significant risks to businesses and financial " +
                "institutions, including the impacts of more frequent and intense extreme weather " +
                "events, changes in the availability of natural resources, and shifts in consumer " +
                "preferences towards low-carbon products and services. Financial institutions and " +
                "investors need to understand these risks and incorporate them into their " +
                "investment strategies."
    ),
    ChapterCard(
        "Impact on Financial Markets",
        "5. Divestment: There is growing movement among investors and financial " +
                "institutions to divest from fossil fuels and to redirect investments towards " +
                "low-carbon and sustainable solutions. This can reduce the financial returns of " +
                "fossil fuel companies and increase the demand for low-carbon alternatives in the " +
                "financial market."
    )
)
val chapter5Cards = arrayListOf(
    ChapterCard(
        "Role of Individuals",
        "Overall, the actions of individuals can significantly contribute to the global effort " +
                "to address climate change and promote sustainable development.\n" +
                "This could have both positive and negative impacts."
    ),
    ChapterCard(
        "Positive Impact",
        "Positively, individuals can also help mitigate climate change by making lifestyle " +
                "changes, such as reducing energy consumption, using renewable energy sources, " +
                "reducing waste and choosing to buy environmentally-friendly products. They can " +
                "also advocate for policy changes, support renewable energy projects and raise " +
                "awareness about the importance of addressing climate change."
    ),
    ChapterCard(
        "Negative Impact",
        "Negatively, individuals contribute to climate change through their daily activities " +
                "such as burning fossil fuels for transportation, heating and electricity generation," +
                "deforestation and land-use change, and the production and consumption of " +
                "goods with high carbon footprints."
    ),
    ChapterCard(
        "Preventions as Individuals",
        "Individuals can make simple changes in their daily lives to reduce their carbon " +
                "footprint, such as conserving energy at home, eating a plant-based diet, and " +
                "reducing waste. It is also important for people to educate themselves and others " +
                "about the causes and impacts of climate change, and to advocate for " +
                "government action to address this global crisis. By taking action now, we can " +
                "help ensure a more sustainable and livable planet for future generations."
    ),

)
val chapter6Cards = arrayListOf(
    ChapterCard(
        "Nature-Based Solutions",
        "Nature-based solutions refer to the use of natural systems, such as forests, " +
                "wetlands, and oceans, to address and mitigate the impacts of climate change.\n" +
                "These solutions can play a critical role in reducing greenhouse gas emissions " +
                "and increasing carbon sequestration, as well as helping to adapt to the impacts " +
                "of climate change."
    ),
    ChapterCard(
        "Examples of Nature-Based Solutions",
        "1. Reforestation and forest conservation to store carbon and provide habitat for " +
                "wildlife.\n" +
                "2. Restoration of wetlands and other ecosystems that help to remove carbon from " +
                "the atmosphere and reduce the risk of flooding.\n" +
                "3. Management of soils and grasslands to enhance their carbon storage capacity " +
                "and improve soil health."
    ),
    ChapterCard(
        "Examples of Nature-Based Solutions",
        "4. Protection and restoration of coastal ecosystems, such as mangroves and coral " +
                "reefs, to protect against rising sea levels and storm surges.\n" +
                "5. Use of agroforestry and conservation agriculture to promote sustainable land use " +
                "and reduce greenhouse gas emissions from agriculture.\n" +
                "6. Nature-based solutions provide multiple benefits, including climate mitigation, " +
                "adaptation, biodiversity conservation, and sustainable livelihoods. They also " +
                "often involve local communities and stakeholders, making them an effective and " +
                "sustainable approach to addressing the challenges posed by climate change."
    ),
    ChapterCard(
        "Technology-Based Solutions",
        "Technical solutions refer to the use of technology to mitigate and adapt to the " +
                "impacts of climate change. Technical solutions aim to reduce greenhouse gas " +
                "emissions and increase energy efficiency, while also developing new " +
                "technologies that can help to reduce our dependence on fossil fuels and promote " +
                "the use of renewable energy sources."
    ),
    ChapterCard(
        "Examples of Technology-Based Solutions",
        "1. Renewable energy technologies, such as solar, wind, hydro, and geothermal " +
                "power, that provide clean and sustainable energy sources.\n" +
                "2. Energy efficiency technologies, such as building insulation and smart energy " +
                "systems, that help to reduce energy consumption and greenhouse gas " +
                "emissions.\n" +
                "3. Carbon capture and storage (CCS) technologies, which involve capturing carbon " +
                "dioxide from power plants and industrial processes and storing it underground to " +
                "prevent it from entering the atmosphere."
    ),
    ChapterCard(
        "Examples of Technology-Based Solutions",
        "4. Electric vehicles (EVs) and sustainable transportation technologies, such as " +
                "high-speed rail and bike-sharing systems, that reduce dependence on fossil fuels " +
                "for transportation.\n" +
                "5. Digital technologies, such as cloud computing and the Internet of Things (IoT), " +
                "that can help to optimize energy use and reduce emissions in various sectors.\n" +
                "6. Technical solutions play a critical role in addressing climate change and " +
                "transitioning to a low-carbon, sustainable future. However, they must be " +
                "implemented in conjunction with policies and regulations that promote " +
                "sustainable development, as well as public education and awareness programs " +
                "that encourage the adoption of clean technologies."
    ),
)
val chapter7Cards = arrayListOf(
    ChapterCard(
        "Global Impact in Future",
        "If we do not take action to address the impacts of climate change, the future of " +
                "our world will be vastly different from what we know today. Climate change is " +
                "expected to have severe and widespread consequences for human societies and " +
                "the natural world."
    ),
    ChapterCard(
        "Issues in Future",
        "1. Rising global temperatures, which will lead to more frequent and intense heat " +
                "waves, droughts, and wildfires.\n" +
                "2. Rising sea levels, which will cause widespread coastal flooding and displacement " +
                "of people living in low-lying areas.\n" +
                "3. Changes in precipitation patterns, which will lead to water scarcity in some " +
                "regions and increased flooding in others.\n" +
                "4. Increased frequency and severity of extreme weather events, such as hurricanes, " +
                "typhoons, and storms."
    ),
    ChapterCard(
        "Issues in Future",
        "5. Disruption of ecosystems and loss of biodiversity, as species struggle to adapt to " +
                "changing conditions.\n" +
                "6. Negative impacts on agriculture and food security, as crop yields decline and " +
                "food prices rise.\n" +
                "7. Spread of diseases as vectors such as mosquitoes move into new regions and " +
                "climates become more suitable for their survival."
    ),
    ChapterCard(
        "Issues in Future",
        "8. Without action, these consequences will become increasingly severe, causing " +
                "widespread social, economic, and environmental disruption. It is essential that " +
                "we act now to reduce greenhouse gas emissions, promote renewable energy, and " +
                "implement nature-based and technical solutions to address the impacts of " +
                "climate change and ensure a sustainable future for ourselves and future " +
                "generations."
    )
)

/* Chapter Cards for Recycling education. */
val chapterR1Cards = arrayListOf(
    ChapterCard(
        "What is recycling",
        "Recycling is the process of converting waste materials into reusable objects to prevent " +
                "waste of potentially useful materials, reduce the consumption of fresh raw materials, " +
                "energy usage, air pollution (from incineration) and water pollution (from land filling) by " +
                "decreasing the need for “conventional” waste disposal and lowering greenhouse gas " +
                "emissions compared to plastic production."
    ),
    ChapterCard(
        "Importance",
        "The benefits are far-reaching, and everybody gains when people adopt recycling as an " +
                "everyday habit. Whether it is a community effort to help beautify a dirty neighborhood " +
                "street or on a larger scale to help a business save hundreds to thousands of dollars on " +
                "waste management, the advantages of a well-maintained recycling program are " +
                "endless."
    ),
    ChapterCard(
        "Ways To Help in Recycling",
        "1. Get involved with local recycling programs.\n" +
                "2. Volunteer to educate a class at a local elementary school. Kids can be huge " +
                "advocates for the war on trash easily holding everyone around them accountable " +
                "for the things they throw in the garbage.\n" +
                "3. Take some time to go around and pick up trash in your own neighborhood or " +
                "surrounding ones.\n" +
                "4. If your job does not have a receptacle for recyclable products, ask if they wouldn’t " +
                "mind providing one, or if they mind you providing one yourself.\n" +
                "5. Make sure to practice proper recycling habits in your own life; nothing works " +
                "better than leading by example."
    )
)
val chapterR2Cards = arrayListOf(
    ChapterCard(
        "What are Single-use plastics ?",
        "Single-use plastics are pieces of plastic that are made to be thrown out.\n" +
                "These plastics prioritize convenience over durability and repeated use, making " +
                "them a prime culprit behind our throw-away society.\n" +
                "Worldwide over 300 million tons of plastic is produced every single year, half of " +
                "this is single-use plastics."
    ),
    ChapterCard("Contribution in Climate Change",
        "1. Because single-use plastic is produced from fossil fuels, the process of " +
                "extracting and creating these plastics emits huge amounts of greenhouse gases.\n" +
                "2. It is estimated that just the extraction of these fossil fuels and their " +
                "transportation to plastic factories emits 12.5 to 1.5 million metric tons of " +
                "greenhouse gases.\n" +
                "3. The refinement of plastics emits an additional 184 to 213 million metric tons of " +
                "greenhouse gases each year."
    ),
    ChapterCard(
        "Contribution in Climate Change",
        "4. The removal of forested land for oil extraction and pipeline construction has also " +
                "resulted in over 1.6 billion metric tons of carbon dioxide being released into the " +
                "atmosphere. This land clearing also limits the amount of carbon dioxide removed " +
                "from the atmosphere.\n" +
                "5. Landfills, where thrown out single-use plastics are sent, account for over 15% of " +
                "methane emissions. The disposal of more plastics to landfills leads to increases " +
                "in landfill size and these emissions."
    ),
    ChapterCard(
        "Alternates",
        "1. Use a reusable water bottle. \n" +
                "2. Bring a reusable bag to the store. \n" +
                "3. Avoid overly packaged items at the grocery store such as pre-cut fruits and " +
                "vegetables.\n" +
                "4. Grocery shop at a bulk foods store. " +
                "5. Repurpose old bottles or containers. " +
                "6. Reduce your waste through various methods like Voting with Your Dollar!"
    ),

)
val chapterR3Cards = arrayListOf(
    ChapterCard(
        "What is E-waste ?",
        "E-Waste contains a mixture of valuable materials that can be recycled (but which " +
                "usually aren’t), and toxic materials such as lead, mercury and cadmium which " +
                "can be hazardous to our health and to the environment."
    ),
    ChapterCard(
        "Demand of E-waste",
        "Electrical and Electronic Equipment (EEE) is increasingly in demand in today’s society, " +
                "driven by higher levels of disposable income, increasing urbanization and " +
                "industrialization, and population growth.\n" +
                "A large proportion of EEE has a short life span, and is often perceived as being difficult " +
                "or expensive to repair. Brands spend billions creating consumer demand for the latest " +
                "models, leaving older technology obsolete and unwanted even when it remains " +
                "serviceable."
    ),
    ChapterCard(
        "Key Facts about E-waste",
        "1. 57.4 Mt (Million Metric Tonnes) of e-waste was generated in 2021. The total is " +
                "growing by an average of 2 Mt a year.\n" +
                "2. There is over 347 Mt of un recycled e-waste on earth in 2023.\n" +
                "3. China, the US, and India produce the most e-waste.\n" +
                "4. Only 17.4% of e-waste is known to be collected and properly recycled.\n" +
                "5. Estonia, Norway, and Iceland have the highest e-waste recycling rates.\n" +
                "6. The e-waste recycling market was valued at \$49,880 million in 2020."
    ),
    ChapterCard("E-waste Items",
        "1. 17.4 Mt of Small Equipment - including microwaves, vacuum cleaners, fans,\n" +
                "kettles, toasters, shavers, hairdryers, radios, tools and toys\n" +
                "2. 13.1 Mt of Large Equipment - including washing machines, tumble dryers,\n" +
                "cookers, stoves and dishwashers\n" +
                "3. 10.8 Mt of Temperature Exchange Equipment - including refrigerators, freezers,\n" +
                "4. air conditioners, and heat pumps\n" +
                "5. 6.7 Mt of Screens and Monitors - including televisions, monitors, laptops,\n" +
                "notebooks, and tablets\n" +
                "6. 4.7 Mt of Small IT & Telecoms Equipment - including cell phones, phone cases,\n" +
                "wireless routers, GPS and pocket calculators\n" +
                "7. 0.9 Mt of lamps, bulbs and LEDs"
    ),
    ChapterCard(
        "E-waste on Earth",
        "There is no official figure for the total amount of un-recycled e-waste currently on Earth.\n" +
                "However, using the latest data that we do have, it is possible to make an estimate.\n" +
                "We know that since data was first collected in 2014, up until the end of 2022 there will " +
                "have been an estimated total of 420.3 Million Metric Tonnes of e-waste produced. We " +
                "also know that on average, only a small percentage of that is recycled"
    ),

)
val chapterR4Cards = arrayListOf(
    ChapterCard(
        "What is Recycling contamination ?",
        "Recycling contamination occurs when materials are sorted into the wrong " +
                "recycling bin (placing a glass bottle into a mixed paper recycling bin for example), " +
                "or when materials are not properly cleaned, such as when food residue remains " +
                "on a plastic yogurt container. This is sometimes referred to as aspirational " +
                "recycling, as you’re simply throwing something into the recycling on the hope that " +
                "it will find its way to where it needs to be eventually. Unfortunately, this is rarely " +
                "the case."
    ),
    ChapterCard(
        "Types of Recycling contamination",
        "1. Plastic Bag\n" +
                "2. Food Waste\n" +
                "3. Loose Shredded-Paper\n" +
                "4. Brightly Colored Paper\n" +
                "5. Some Beverage Cartons\n" +
                "6. The Wrong Plastics\n" +
                "7. Hazardous Waste\n" +
                "8. Bio-Hazardous Waste (and Diapers)\n" +
                "9. Frozen Food Containers\n" +
                "10. Unrinsed or Metal-Capped Glass"
    ),
    ChapterCard(
        "Why Recycling contamination matters",
        "1. Recycling Becomes Impossible\n" +
                "2. Recycling Machinery Maintenance3. Unsafe Work Environments for Those Sorting Your Stuff\n" +
                "4. Devaluation\n" +
                "5. Damaged Recycling Relationship"
    ),
    ChapterCard(
        "Preventions",
        "1. Over-Communicate\n" +
                "2. Keep Them Separated\n" +
                "3. Keep it Clean"
    )
)
val chapterR5Cards = arrayListOf(
    ChapterCard(
        "What is the Circular economy ?",
        "A circular economy keeps materials, products, and services in circulation for as " +
                "long possible. The Save Our Seas 2.0 Act refers to an economy that uses a " +
                "systems-focused approach and involves industrial processes and economic " +
                "activities that are restorative or regenerative by design, enables resources used in " +
                "such processes and activities to maintain their highest value for as long as " +
                "possible, and aims for the elimination of waste through the superior design of " +
                "materials, products, and systems (including business models). It is a change to " +
                "the model in which resources are mined, made into products, and then become " +
                "waste. A circular economy reduces material use, redesigns materials, products, " +
                "and services to be less resource intensive, and recaptures “waste” as a resource " +
                "to manufacture new materials and products."
    ),
    ChapterCard(
        "Importance of Circular Economy",
        "This work on a circular economy is an important part of slowing climate change. We " +
                "must take action to address the climate crisis, and material recovery has an important " +
                "role to play. The United Nations’ International Resource Panel concluded that natural " +
                "resource extraction and processing contribute to about half of all global greenhouse gas " +
                "emissions. That is why EPA is developing strategies to identify the key actions needed " +
                "to reduce the impact these materials can cause."
    ),
    ChapterCard(
        "EPA actions",
        "1. In November 2021, EPA published the National Recycling Strategy: Part One of a " +
                "Series on Building a Circular Economy for All.2. We showcase our efforts in creating a circular economy for all in Fiscal Year " +
                "2022 in the report Progress in Building a Circular Economy (pdf).\n" +
                "3. EPA is developing action plans and strategies for electronics, plastics, and food " +
                "loss and waste and organics. Stay tuned!"
    ),
    ChapterCard(
        "Organizations working on Circular Economy",
        "1. Ellen MacArthur Foundation.\n" +
                "2. European Union.\n" +
                "3. National Institute of Standards and Technology.\n" +
                "4. National Renewable Energy Laboratory: Circular Economy Modeling and Analysis " +
                "Tools.\n" +
                "5. Organisation for Economic Co-operation and Development.\n" +
                "6. United Nations Environment Programme: Building Circularity.\n" +
                "7. U.S. Chamber of Commerce Foundation: Circular Economy Toolbox.\n" +
                "8. World Circular Economy Forum."
    ),
)
val chapterR6Cards = arrayListOf(
    ChapterCard(
        "What is the Extended producer responsibility ?",
        "Extended Producer Responsibility is a concept where manufacturers and importers of " +
                "products bear a significant degree of responsibility for the environmental impacts of " +
                "their products throughout the product life-cycle."
    ),
    ChapterCard(
        "Why it matters",
        "If not managed correctly, plastic waste poses a critical threat to our environment.\n" +
                "Considering the increased use of the material and its numerous applications, the " +
                "amount of plastic waste has seen an exponential rise in the last couple of years.\n" +
                "It's therefore crucial for plastic producers and manufacturers to manage the collection " +
                "and processing of the plastic waste they produce."
    ),
    ChapterCard(
        "How it works",
        "For EPR to be sustainable, we need to invest in the collection and recycling " +
                "infrastructure, train and develop skills in waste management and lastly create value out " +
                "of waste through robust R&D and access to global markets. This is why we ensure that the funds obtained through EPR are invested towards the betterment of the PLANET " +
                "and PEOPLE behind the plastic collection."
    ),
    ChapterCard(
        "Organizations working on Circular Economy",
        "TRANSPARENCY, TRACEABILITY & TECHNOLOGY:We use our technology platform to " +
                "trace all the buy-sell transactions and trace where the collected plastic waste is coming " +
                "from. We thrive on our transparent and fair trade model.\n" +
                "CERTIFICATION PROCESS:Being WFTO and OBP certified, we take full responsibility for " +
                "the entire process end to end with verification and tracking available at each step."
    ),
    ChapterCard(
        "Organizations working on Circular Economy",
        "ENSURING FAIR INVESTMENTS:We ensure that all EPR funds are being used to address " +
                "the core issues in collection - value creation. The money invested goes towards the " +
                "betterment of the PLANET and PEOPLE behind the plastic collection.\n" +
                "LIVELIHOODS CREATION:Our EPR partners ensure fair wages and better livelihoods for " +
                "waste collectors at the base of our supply chain with 80% of EPR credits going towards " +
                "their collection of plastic."
    ),
)
val chapterR7Cards = arrayListOf(
    ChapterCard(
        "What is Sustainable packaging ?",
        "Packaging materials are some of the most ubiquitous and easily recognizable " +
                "items people use in our daily lives. Packaging includes plastic bottles, metal " +
                "cans, food wrappings, corrugated cardboard boxes and many more materials.\n" +
                "Understanding the production and disposal of these materials is crucial in " +
                "making economic and environmentally conscious decisions."
    ),
    ChapterCard(
        "sustainable packaging relates to Sustainable Materials Management?",
        "By applying sustainable materials management principles to this sector, the US can " +
                "reduce environmental impacts while recovering potentially lost economic revenue.\n" +
                "Encouraging the shift in packaging construction towards more lightweight or efficient " +
                "materials helps companies save money while decreasing the amount of waste " +
                "generated when the packaging is discarded. Also important is the recovery of thepackaging discards; not only is there high commodity value in these items, but recycling " +
                "keeps these goods out of landfills."
    ),
)
val chapterR8Cards = arrayListOf(
    ChapterCard(
        "What is Zero Waste ?",
        "The conservation of all resources by means of responsible production, " +
                "consumption, reuse, and recovery of products, packaging, and materials without " +
                "burning and with no discharges to land, water, or air that threaten the " +
                "environment or human health. Implementing Zero Waste will eliminate all " +
                "discharges to land, water or air that are a threat to planetary, human, animal or " +
                "plant health."
    ),
    ChapterCard(
        "Zero waste hierarchy principles",
        "1. Rethink\n" +
                "2. Reuse\n" +
                "3. Reduce\n" +
                "4. Recycle\n" +
                "5. Material Recovery\n" +
                "6. Residual Management\n" +
                "7. Unacceptable"
    ),
    ChapterCard(
        "Zero waste Movement",
        "The zero waste movement is the collective pursuit of the zero waste principles, and as " +
                "its popularity grows, individuals and communities around the world are helping push the " +
                "agenda further. One of the most visible of many initiatives that are illuminating our " +
                "consumption and waste generation habits is the ‘Mason Jar Challenge’ where " +
                "participants reduce their waste down to a single mason jar over one year. However, the " +
                "zero waste movement is gathering steam, and there are many more initiatives in the " +
                "pipeline."
    ),
    ChapterCard(
        "Implementation",
        "Many cities in the United States and around the world have set zero waste goals, among " +
                "them New York City, Dallas, Los Angeles, San Francisco, Vancouver, Buenos Aires, " +
                "London, Milan, Paris and Tokyo. The plans may differ, but the overarching goal is to stop " +
                "the relentless transformation of natural resources into garbage. Achieving this goal " +
                "would go far in eliminating the many negative local and global consequences stemming " +
                "from the current mismanagement of our life-sustaining material flows."
    )
)

/* Chapters of climate  change education. */
val climateChangeChapters = arrayListOf<Chapter>(
    Chapter(1, "Introduction", 1, chapterCards),
    Chapter(2, "Reason of Climate Change", 0, chapter2Cards),
    Chapter(3, "Impact of Climate Change", 0, chapter3Cards),
    Chapter(4, "Climate and Financial Markets", 0, chapter4Cards),
    Chapter(5, "Role of Individuals in Climate Change", 0, chapter5Cards),
    Chapter(6, "Climate Change Solutions ", 0, chapter6Cards),
    Chapter(7, "Future of world", 0, chapter7Cards)
)

val recyclingChapters = arrayListOf<Chapter>(
    Chapter(1, "Introduction", 1, chapterR1Cards),
    Chapter(2, "Single-use plastics", 0, chapterR2Cards),
    Chapter(3, "E-Waste", 0, chapterR3Cards),
    Chapter(4, "Recycling contamination", 0, chapterR4Cards),
    Chapter(5, "Circular economy", 0, chapterR5Cards),
    Chapter(6, "Extended producer responsibility", 0, chapterR6Cards),
    Chapter(7, "Sustainable packaging", 0, chapterR7Cards),
    Chapter(8, "Zero waste", 0, chapterR8Cards)
)

val testTipsAndArticles = arrayListOf(
    "Aerosols",
    "Newspaper",
    "Clothing",
    "Electrical Items",
    "Furniture",
    "Cosmetics",
    "Paper",
    "Plastic Bags"
)
val recycleItems = arrayListOf(
    RecycleItem("Aerosols", "Recyclable at home"),
    RecycleItem("Newspaper", "Recyclable at home"),
    RecycleItem("Clothing", "Recyclable at home"),
    RecycleItem("Electrical Items", "Recyclable at home"),
    RecycleItem("Furniture", "Recyclable at home"),
    RecycleItem("Cosmetics", "Recyclable at home"),
    RecycleItem("Paper", "Recyclable at home"),
    RecycleItem("Plastic Bags", "Recyclable at home")
)

val embedYoutubeVideos = arrayListOf(
    "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/n-GlRmOkDkw\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>",
    "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/DTJ9aP_Nmqo\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>"
)
