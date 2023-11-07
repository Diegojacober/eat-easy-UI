package com.diegojacober.delivery.util;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class Chart {
    public static JPanel createChartPanel() {
        DefaultCategoryDataset dataset = createDataset();
        JFreeChart barChart = createBarChart(dataset);
        ChartPanel chartPanel = new ChartPanel(barChart);

        JPanel panel = new JPanel();
        panel.setBounds(80, 60, 410, 190);
        panel.setLayout(new BorderLayout());
        panel.add(chartPanel);

        panel.setVisible(true);
        return panel;
    }
    
    public static DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Janeiro", "Value 1");
        dataset.addValue(2.0, "Category 1", "Value 2");
        dataset.addValue(3.0, "Category 1", "Value 3");
        dataset.addValue(4.0, "Category 2", "Value 1");
        dataset.addValue(5.0, "Category 2", "Value 2");
        dataset.addValue(6.0, "Category 2", "Value 3");
        return dataset;
    }

    public static JFreeChart createBarChart(DefaultCategoryDataset dataset) {
        return ChartFactory.createBarChart(
                "Vendas por mês",     // Título do gráfico
                "Mês",             // Rótulo do eixo X
                "Valor",                // Rótulo do eixo Y
                dataset,                // Conjunto de dados
                PlotOrientation.VERTICAL,
                true, true, false
        );
    }
}
